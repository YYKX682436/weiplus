package a4;

/* loaded from: classes13.dex */
public class d implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p094xbe953013.p095x38b73479.e f82694d;

    /* renamed from: e, reason: collision with root package name */
    public final a4.a f82695e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f82696f = false;

    public d(p012xc85e97e9.p094xbe953013.p095x38b73479.e eVar, a4.a aVar) {
        this.f82694d = eVar;
        this.f82695e = aVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        this.f82695e.mo518x99a02ef7(this.f82694d, obj);
        this.f82696f = true;
    }

    /* renamed from: toString */
    public java.lang.String m526x9616526c() {
        return this.f82695e.toString();
    }
}
