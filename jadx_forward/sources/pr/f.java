package pr;

/* loaded from: classes4.dex */
public final class f extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final int f439236f;

    /* renamed from: g, reason: collision with root package name */
    public final pr.d f439237g;

    public f(int i17) {
        this.f439236f = i17;
        this.f439237g = new pr.d(i17, new pr.e(this));
    }

    @Override // fp0.d
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiDesignerTask", "call: " + this.f439236f);
        this.f439237g.b();
    }

    @Override // fp0.d
    public java.lang.String d() {
        return java.lang.String.valueOf(this.f439236f);
    }
}
