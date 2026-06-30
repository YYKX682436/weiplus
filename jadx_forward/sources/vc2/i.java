package vc2;

/* loaded from: classes15.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f516778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vc2.j f516779e;

    public i(vc2.j jVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f516779e = jVar;
        this.f516778d = c1163xf1deaba4;
    }

    @Override // java.lang.Runnable
    public void run() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f516778d;
        if (c1163xf1deaba4.m7949x5701d990() != null) {
            c1163xf1deaba4.m7949x5701d990().p(new vc2.h(this));
            return;
        }
        vc2.j jVar = this.f516779e;
        jVar.f516781b = false;
        jVar.f516780a.m8087x46ac7299();
    }
}
