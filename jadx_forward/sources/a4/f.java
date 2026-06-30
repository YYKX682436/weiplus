package a4;

/* loaded from: classes13.dex */
public class f extends p012xc85e97e9.p093xedfae76a.c1 {

    /* renamed from: f, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.f1 f82697f = new a4.e();

    /* renamed from: d, reason: collision with root package name */
    public final x.o f82698d = new x.o();

    /* renamed from: e, reason: collision with root package name */
    public boolean f82699e = false;

    @Override // p012xc85e97e9.p093xedfae76a.c1
    /* renamed from: onCleared */
    public void mo528x82b764cd() {
        super.mo528x82b764cd();
        x.o oVar = this.f82698d;
        int h17 = oVar.h();
        for (int i17 = 0; i17 < h17; i17++) {
            a4.c cVar = (a4.c) oVar.i(i17);
            p012xc85e97e9.p094xbe953013.p095x38b73479.e eVar = cVar.f82690f;
            eVar.m7839x708e9a80();
            eVar.m7838xb801ce75();
            a4.d dVar = cVar.f82692h;
            if (dVar != null) {
                cVar.mo522xb5bdeb7a(dVar);
                if (dVar.f82696f) {
                    dVar.f82695e.mo519x40d6999d(dVar.f82694d);
                }
            }
            eVar.m7863xc221c110(cVar);
            eVar.m7857x6761d4f();
        }
        int i18 = oVar.f532384g;
        java.lang.Object[] objArr = oVar.f532383f;
        for (int i19 = 0; i19 < i18; i19++) {
            objArr[i19] = null;
        }
        oVar.f532384g = 0;
        oVar.f532381d = false;
    }
}
