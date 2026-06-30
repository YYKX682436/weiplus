package wa5;

/* loaded from: classes14.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f525852a;

    /* renamed from: b, reason: collision with root package name */
    public final wa5.j f525853b;

    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, wa5.j uic) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uic, "uic");
        this.f525852a = activity;
        this.f525853b = uic;
    }

    public static android.os.Bundle a(wa5.h hVar, android.view.View view, wa5.a aVar, android.content.Intent intent, int i17, java.lang.Object obj) {
        android.util.Pair[] pairArr;
        android.os.ResultReceiver resultReceiver;
        java.lang.String str;
        jz5.f0 f0Var = null;
        if ((i17 & 2) != 0) {
            aVar = null;
        }
        if ((i17 & 4) != 0) {
            intent = null;
        }
        if (hVar.f525853b.f525858f) {
            return null;
        }
        wa5.d dVar = wa5.d.f525848a;
        java.util.List<android.util.Pair> a17 = view != null ? wa5.e.a(view) : null;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = hVar.f525852a;
        java.util.Objects.toString(activityC0065xcd7aa112);
        java.util.Objects.toString(a17);
        if (!(activityC0065xcd7aa112 instanceof android.app.Activity)) {
            return null;
        }
        dVar.b(activityC0065xcd7aa112, false, aVar);
        dVar.c(activityC0065xcd7aa112);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (a17 != null) {
            for (android.util.Pair pair : a17) {
                arrayList.add(new m3.d(pair.first, pair.second));
            }
        }
        m3.d[] dVarArr = (m3.d[]) arrayList.toArray(new m3.d[0]);
        m3.d[] dVarArr2 = (m3.d[]) java.util.Arrays.copyOf(dVarArr, dVarArr.length);
        if (dVarArr2 != null) {
            pairArr = new android.util.Pair[dVarArr2.length];
            for (int i18 = 0; i18 < dVarArr2.length; i18++) {
                m3.d dVar2 = dVarArr2[i18];
                pairArr[i18] = android.util.Pair.create((android.view.View) dVar2.f404625a, (java.lang.String) dVar2.f404626b);
            }
        } else {
            pairArr = null;
        }
        android.os.Bundle bundle = z2.k.b(activityC0065xcd7aa112, pairArr).toBundle();
        if (bundle != null) {
            try {
                resultReceiver = (android.os.ResultReceiver) bundle.getParcelable("android:activity.transitionCompleteListener");
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MM.Transition", th6, "getEnter err", new java.lang.Object[0]);
                str = "err";
            }
        } else {
            resultReceiver = null;
        }
        if (!(resultReceiver instanceof android.os.ResultReceiver)) {
            resultReceiver = null;
        }
        if (resultReceiver != null) {
            wa5.d.f525848a.a(activityC0065xcd7aa112).f525844c.add(new java.lang.ref.WeakReference(resultReceiver));
            str = "isNotNull:" + resultReceiver;
            f0Var = jz5.f0.f384359a;
        } else {
            str = "default";
        }
        if (f0Var == null) {
            str = "isNull";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MM.Transition", "initOptionBundle act:" + activityC0065xcd7aa112 + ", coordinator:" + str);
        dVar.a(activityC0065xcd7aa112).f525845d = new java.lang.ref.WeakReference(aVar);
        if (intent != null) {
            intent.putExtra("KEY_EXIT_ACTIVITY", activityC0065xcd7aa112.hashCode());
        }
        return bundle;
    }
}
