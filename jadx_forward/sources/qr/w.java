package qr;

/* loaded from: classes12.dex */
public final class w implements qr.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qr.x f447583a;

    public w(qr.x xVar) {
        this.f447583a = xVar;
    }

    @Override // qr.i
    /* renamed from: onResult */
    public final void mo44657x57429edc(int i17, java.lang.String str) {
        qr.x xVar = this.f447583a;
        if (i17 == 0) {
            xVar.e(new qr.v(xVar));
        } else {
            xVar.a(i17);
        }
    }
}
