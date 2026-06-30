package b73;

/* loaded from: classes15.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f18216a;

    /* renamed from: b, reason: collision with root package name */
    public j6.c f18217b;

    /* renamed from: c, reason: collision with root package name */
    public android.content.ServiceConnection f18218c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18219d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f18220e;

    /* renamed from: f, reason: collision with root package name */
    public b73.h f18221f;

    public i(android.content.Context context) {
        this.f18216a = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0011, code lost:
    
        if (r4.equals("") != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(b73.i r3, java.lang.String r4) {
        /*
            java.lang.String r0 = "Error consuming token "
            java.lang.String r1 = "Can't consume "
            java.lang.String r2 = "consume"
            r3.c(r2)
            if (r4 == 0) goto L13
            java.lang.String r2 = ""
            boolean r2 = r4.equals(r2)     // Catch: android.os.RemoteException -> L4b
            if (r2 == 0) goto L27
        L13:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L4b
            r2.<init>(r1)     // Catch: android.os.RemoteException -> L4b
            r2.append(r4)     // Catch: android.os.RemoteException -> L4b
            java.lang.String r1 = ". No token."
            r2.append(r1)     // Catch: android.os.RemoteException -> L4b
            java.lang.String r1 = r2.toString()     // Catch: android.os.RemoteException -> L4b
            r3.g(r1)     // Catch: android.os.RemoteException -> L4b
        L27:
            j6.c r1 = r3.f18217b     // Catch: android.os.RemoteException -> L4b
            android.content.Context r3 = r3.f18216a     // Catch: android.os.RemoteException -> L4b
            java.lang.String r3 = r3.getPackageName()     // Catch: android.os.RemoteException -> L4b
            j6.a r1 = (j6.a) r1     // Catch: android.os.RemoteException -> L4b
            r2 = 3
            int r3 = r1.d(r2, r3, r4)     // Catch: android.os.RemoteException -> L4b
            if (r3 != 0) goto L39
            return
        L39:
            b73.a r1 = new b73.a     // Catch: android.os.RemoteException -> L4b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: android.os.RemoteException -> L4b
            r2.<init>(r0)     // Catch: android.os.RemoteException -> L4b
            r2.append(r4)     // Catch: android.os.RemoteException -> L4b
            java.lang.String r0 = r2.toString()     // Catch: android.os.RemoteException -> L4b
            r1.<init>(r3, r0)     // Catch: android.os.RemoteException -> L4b
            throw r1     // Catch: android.os.RemoteException -> L4b
        L4b:
            r3 = move-exception
            b73.a r0 = new b73.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Remote exception while consuming. token: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r1 = -1001(0xfffffffffffffc17, float:NaN)
            r0.<init>(r1, r4, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b73.i.a(b73.i, java.lang.String):void");
    }

    public static int b(b73.i iVar, android.content.Intent intent, java.lang.String str) {
        android.content.Context context = iVar.f18216a;
        context.getPackageName();
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList<>();
        java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
        java.lang.String str2 = null;
        do {
            j6.c cVar = iVar.f18217b;
            java.lang.String packageName = context.getPackageName();
            j6.a aVar = (j6.a) cVar;
            aVar.getClass();
            android.os.Parcel obtain = android.os.Parcel.obtain();
            android.os.Parcel obtain2 = android.os.Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.android.vending.billing.IInAppBillingService");
                obtain.writeInt(3);
                obtain.writeString(packageName);
                obtain.writeString(str);
                obtain.writeString(str2);
                aVar.f297838d.transact(4, obtain, obtain2, 0);
                obtain2.readException();
                android.os.Bundle bundle = (android.os.Bundle) (obtain2.readInt() != 0 ? android.os.Bundle.CREATOR.createFromParcel(obtain2) : null);
                obtain2.recycle();
                obtain.recycle();
                int e17 = iVar.e(bundle);
                java.lang.String.valueOf(e17);
                if (e17 != 0) {
                    return e17;
                }
                if (!bundle.containsKey("INAPP_PURCHASE_ITEM_LIST") || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
                    iVar.g("Bundle returned from getPurchases() doesn't contain required fields.");
                    return com.tencent.live.TXLivePluginDef.ErrorCode.CODE_PARAMTYPEERROR;
                }
                arrayList.addAll(bundle.getStringArrayList("INAPP_PURCHASE_ITEM_LIST"));
                arrayList2.addAll(bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST"));
                arrayList3.addAll(bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST"));
                str2 = bundle.getString("INAPP_CONTINUATION_TOKEN");
            } catch (java.lang.Throwable th6) {
                obtain2.recycle();
                obtain.recycle();
                throw th6;
            }
        } while (!android.text.TextUtils.isEmpty(str2));
        intent.putStringArrayListExtra("INAPP_PURCHASE_ITEM_LIST", arrayList);
        intent.putStringArrayListExtra("INAPP_PURCHASE_DATA_LIST", arrayList2);
        intent.putStringArrayListExtra("INAPP_DATA_SIGNATURE_LIST", arrayList3);
        return 0;
    }

    public static java.lang.String f(int i17) {
        java.lang.String[] split = "0:OK/1:User Canceled/2:Unknown/3:Billing Unavailable/4:Item unavailable/5:Developer Error/6:Error/7:Item Already Owned/8:Item not owned".split("/");
        java.lang.String[] split2 = "0:OK/-1001:Remote exception during initialization/-1002:Bad response received/-1003:Purchase signature verification failed/-1004:Send intent failed/-1005:User cancelled/-1006:Unknown purchase response/-1007:Missing token/-1008:Unknown error/-1009:Subscriptions not available/-1010:Invalid consumption attempt".split("/");
        if (i17 > -1000) {
            if (i17 >= 0 && i17 < split.length) {
                return split[i17];
            }
            return java.lang.String.valueOf(i17) + ":Unknown";
        }
        int i18 = (-1000) - i17;
        if (i18 >= 0 && i18 < split2.length) {
            return split2[i18];
        }
        return java.lang.String.valueOf(i17) + ":Unknown IAB Helper Error";
    }

    public final void c(java.lang.String str) {
        if (this.f18219d) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.IabHelper", "Illegal state for operation (" + str + "): IAB helper is not set up.");
        throw new java.lang.IllegalStateException("IAB helper is not set up. Can't perform operation: " + str);
    }

    public void d() {
        this.f18219d = false;
        android.content.ServiceConnection serviceConnection = this.f18218c;
        if (serviceConnection != null) {
            try {
                android.content.Context context = this.f18216a;
                if (context != null) {
                    context.unbindService(serviceConnection);
                }
            } catch (java.lang.IllegalArgumentException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.IabHelper", e17.toString());
            }
            this.f18218c = null;
            this.f18217b = null;
        }
    }

    public final int e(android.os.Bundle bundle) {
        java.lang.Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            return 0;
        }
        if (obj instanceof java.lang.Integer) {
            return ((java.lang.Integer) obj).intValue();
        }
        if (obj instanceof java.lang.Long) {
            return (int) ((java.lang.Long) obj).longValue();
        }
        g("Unexpected type for bundle response code.");
        g(obj.getClass().getName());
        throw new java.lang.RuntimeException("Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
    }

    public final void g(java.lang.String str) {
        com.tencent.mars.xlog.Log.e("MicroMsg.IabHelper", "In-app billing error: " + str);
    }

    public void h(b73.g gVar) {
        if (this.f18219d) {
            throw new java.lang.IllegalStateException("IAB helper is already set up.");
        }
        this.f18218c = new b73.b(this, gVar);
        android.content.Intent intent = new android.content.Intent("com.android.vending.billing.InAppBillingService.BIND");
        intent.setPackage("com.android.vending");
        android.content.Context context = this.f18216a;
        if (context != null && context.getPackageManager() != null && context.getPackageManager().queryIntentServices(intent, 0) != null && !context.getPackageManager().queryIntentServices(intent, 0).isEmpty()) {
            context.bindService(intent, this.f18218c, 1);
        } else if (gVar != null) {
            gVar.a(new b73.j(-2001, "Google play not installed!"));
        }
    }
}
