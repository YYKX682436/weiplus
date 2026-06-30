package ew;

/* loaded from: classes11.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ew.m f338518d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f338519e;

    public k(ew.m mVar, java.lang.String str) {
        this.f338518d = mVar;
        this.f338519e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ew.m mVar = this.f338518d;
        try {
            com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23598x99bf6511 c23598x99bf6511 = mVar.f338522e;
            if (c23598x99bf6511 != null) {
                c23598x99bf6511.m87338xb5ae70e3(new ew.j(this.f338519e));
            }
        } finally {
            mVar.f338524g = null;
        }
    }
}
