package h93;

/* loaded from: classes11.dex */
public final class i implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h93.k f361238d;

    public i(h93.k kVar) {
        this.f361238d = kVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String str;
        java.util.ArrayList K1;
        if (editable == null || (str = editable.toString()) == null) {
            str = "";
        }
        h93.k kVar = this.f361238d;
        kVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!r26.n0.N(str)) {
            com.p314xaae8f345.mm.p2621x8fb0427b.h4 wi6 = b93.r.wi();
            if (wi6 != null && (K1 = wi6.K1(str)) != null) {
                java.util.Iterator it = K1.iterator();
                while (it.hasNext()) {
                    arrayList.add(((com.p314xaae8f345.mm.p2621x8fb0427b.d4) it.next()).f66586x7661fe9a);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelStateUIC", "searchResultStrList: " + arrayList.size());
        }
        for (java.lang.Class cls : h93.k.f361240q) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = kVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((h93.c) pf5.z.f435481a.a(activity).a(cls)).U6(str, r26.n0.N(str) ? null : arrayList);
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
