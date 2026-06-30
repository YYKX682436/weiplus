package mx2;

/* loaded from: classes2.dex */
public final class a implements p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15299xde732234 f414012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 f414013e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15299xde732234 c15299xde732234, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041) {
        this.f414012d = c15299xde732234;
        this.f414013e = c15401xb8016041;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void R3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int u07 = this.f414012d.u0(view);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onChildViewAttachedToWindow position:");
        sb6.append(u07);
        sb6.append(" focusPosition:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = this.f414013e;
        sb6.append(c15401xb8016041.getFocusPosition());
        sb6.append(" pending:");
        sb6.append(c15401xb8016041.B);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.ImageBanner", sb6.toString());
        if (u07 == c15401xb8016041.B) {
            c15401xb8016041.p(u07);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.a
    public void p3(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}
