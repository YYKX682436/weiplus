package yo4;

/* loaded from: classes10.dex */
public final class b0 implements bp4.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a f545713d;

    public b0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.C18794x5f9cad3a c18794x5f9cad3a) {
        this.f545713d = c18794x5f9cad3a;
    }

    @Override // bp4.c0
    public void h(long j17, java.lang.Object obj) {
        yo4.p pVar = this.f545713d.f257388w;
        if (pVar != null) {
            pVar.H(j17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addMusicPlugin");
            throw null;
        }
    }

    @Override // bp4.c0
    /* renamed from: pause */
    public void mo10983x65825f6() {
        yo4.p pVar = this.f545713d.f257388w;
        if (pVar != null) {
            pVar.mo11000xb01dfb57();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addMusicPlugin");
            throw null;
        }
    }

    @Override // bp4.c0
    /* renamed from: resume */
    public void mo10984xc84dc82d() {
        yo4.p pVar = this.f545713d.f257388w;
        if (pVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addMusicPlugin");
            throw null;
        }
        if (pVar.f545820r != null) {
            if (pVar != null) {
                pVar.G();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("addMusicPlugin");
                throw null;
            }
        }
    }
}
