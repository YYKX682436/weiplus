package hw3;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static java.util.Map f367116a = new java.util.concurrent.ConcurrentHashMap();

    public static void a(android.content.Context context, java.lang.String str, int i17, int i18, uc0.p pVar) {
        b(context, new uc0.v(str, i17, i18, pVar));
    }

    public static void b(android.content.Context context, final uc0.v vVar) {
        final int hashCode = context.hashCode();
        r45.sn snVar = new r45.sn();
        snVar.f467384e = java.util.UUID.randomUUID().toString();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (vVar != null) {
            try {
                java.lang.String str = vVar.f507821h;
                if (str != null) {
                    hashMap.put("heading", fp.s0.b(str, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6));
                }
            } catch (java.io.UnsupportedEncodingException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SelectTextUILogic", "");
            }
            hashMap.put("businessType", java.lang.String.valueOf(vVar.f507822i));
        }
        java.lang.String c17 = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.g(11).c();
        hashMap.put("lang", com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a));
        hashMap.put("platform", com.p159x477cd522.p160x333422.C1461x7397cc93.f4735xf773c24f);
        hashMap.put("version", java.lang.String.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(11)));
        hashMap.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56087x98abae37, com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.b());
        hashMap.put("isClientLoading", "1");
        hashMap.put("wechatVersion", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274644g);
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("file://");
        stringBuffer.append(c17);
        stringBuffer.append("?");
        stringBuffer.append(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.k(hashMap));
        snVar.f467385f = stringBuffer.toString();
        final jw3.i iVar = new jw3.i(context, snVar, vVar.f507824k);
        iVar.show();
        iVar.getWindow().setLayout(-1, -1);
        android.view.View.OnClickListener onClickListener = new android.view.View.OnClickListener() { // from class: hw3.a$$a
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                java.lang.Object obj = new java.lang.Object();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                uc0.v vVar2 = uc0.v.this;
                arrayList.add(vVar2);
                jw3.i iVar2 = iVar;
                arrayList.add(iVar2);
                int i17 = hashCode;
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj, array);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(vVar2);
                arrayList2.add(iVar2);
                arrayList2.add(java.lang.Integer.valueOf(i17));
                arrayList2.add(view);
                java.lang.Object[] array2 = arrayList2.toArray();
                arrayList2.clear();
                yj0.a.b("com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", obj2, array2);
                uc0.p pVar = vVar2.f507817d;
                if (pVar != null) {
                    pVar.a(vVar2.f507818e);
                    iVar2.dismiss();
                    ((java.util.concurrent.ConcurrentHashMap) hw3.a.f367116a).remove(java.lang.Integer.valueOf(i17));
                }
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                yj0.a.h(new java.lang.Object(), "com/tencent/mm/plugin/remark/selecttext/SelectTextUILogic", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        };
        android.widget.Button button = iVar.f383862n;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
        vVar.f507823j = iVar.f383862n;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        f367116a = concurrentHashMap;
        concurrentHashMap.put(java.lang.Integer.valueOf(hashCode), vVar);
    }
}
