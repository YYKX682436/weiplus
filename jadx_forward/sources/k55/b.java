package k55;

/* loaded from: classes4.dex */
public abstract class b extends k55.d {

    /* renamed from: d, reason: collision with root package name */
    public final k55.k f385996d;

    /* renamed from: e, reason: collision with root package name */
    public k55.e f385997e;

    public b(k55.k kVar) {
        this.f385996d = kVar;
    }

    /* renamed from: CLIENT_CALL */
    public java.lang.Object m142013x77b46a52(java.lang.String str, java.lang.Object... objArr) {
        android.os.Bundle d17 = d(objArr);
        try {
            this.f385997e.mo66824x9ad64344(str, d17, true);
        } catch (java.lang.Exception e17) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseClientRequest", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
        return d17.get("result_key");
    }

    /* renamed from: REMOTE_CALL */
    public java.lang.Object m142014x6c2fab7(java.lang.String str, java.lang.Object... objArr) {
        k55.k kVar = this.f385996d;
        if (!kVar.c()) {
            kVar.a(new k55.a(this, objArr, str));
            return null;
        }
        android.os.Bundle d17 = d(objArr);
        kVar.b(this, str, d17);
        d17.setClassLoader(getClass().getClassLoader());
        return d17.get("result_key");
    }

    public android.os.Bundle d(java.lang.Object... objArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        int length = objArr.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.Object obj = objArr[i17];
            if (obj instanceof android.os.Bundle) {
                bundle.putBundle("" + i17, (android.os.Bundle) objArr[i17]);
            } else if (obj instanceof android.os.Parcelable) {
                bundle.putParcelable("" + i17, (android.os.Parcelable) objArr[i17]);
            } else {
                bundle.putSerializable("" + i17, (java.io.Serializable) objArr[i17]);
            }
        }
        return bundle;
    }

    /* renamed from: getArgs */
    public java.lang.Object[] m142015xfb7d3953(android.os.Bundle bundle) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        int size = bundle.size();
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.String str = "" + i17;
            if (bundle.containsKey(str)) {
                linkedList.add(bundle.get(str));
            }
        }
        return linkedList.toArray();
    }

    /* renamed from: onCallback */
    public void mo66824x9ad64344(java.lang.String str, android.os.Bundle bundle, boolean z17) {
        java.lang.reflect.Method method;
        try {
            java.lang.reflect.Method[] methods = getClass().getMethods();
            int length = methods.length;
            int i17 = 0;
            while (true) {
                if (i17 >= length) {
                    method = null;
                    break;
                }
                method = methods[i17];
                if (method.getName().equalsIgnoreCase(str)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (method != null) {
                if (method.isAnnotationPresent(z17 ? k55.l.class : k55.m.class)) {
                    java.lang.Object invoke = method.invoke(this, m142015xfb7d3953(bundle));
                    if (method.getReturnType() != java.lang.Void.TYPE) {
                        bundle.putSerializable("result_key", (java.io.Serializable) invoke);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseClientRequest", "exception:%s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e17));
        }
    }
}
