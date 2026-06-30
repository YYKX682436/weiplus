package tj3;

/* loaded from: classes14.dex */
public final class e implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tj3.h f501265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f501266e;

    public e(tj3.h hVar, android.content.Context context) {
        this.f501265d = hVar;
        this.f501266e = context;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe m166666xc77f5de4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe m166666xc77f5de42;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1891xcaa9f6bc.C16591xa5634bbe m166666xc77f5de43;
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        tj3.h hVar = this.f501265d;
        m166666xc77f5de4 = hVar.m166666xc77f5de4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        m166666xc77f5de4.m67103xdd7d58e5(bool.booleanValue());
        boolean booleanValue = bool.booleanValue();
        android.content.Context context = this.f501266e;
        if (booleanValue) {
            m166666xc77f5de43 = hVar.m166666xc77f5de4();
            m166666xc77f5de43.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3c));
        } else {
            m166666xc77f5de42 = hVar.m166666xc77f5de4();
            m166666xc77f5de42.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3b));
        }
    }
}
