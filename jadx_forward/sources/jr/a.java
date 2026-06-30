package jr;

/* loaded from: classes12.dex */
public abstract class a implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public final im5.b f382817d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f382818e = true;

    public a(im5.b bVar) {
        this.f382817d = bVar;
        if (bVar != null) {
            bVar.mo46316x322b85(this);
        }
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        this.f382818e = false;
    }
}
