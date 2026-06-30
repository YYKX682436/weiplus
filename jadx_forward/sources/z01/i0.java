package z01;

/* loaded from: classes9.dex */
public class i0 implements q31.p {

    /* renamed from: d, reason: collision with root package name */
    public boolean f550587d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f550588e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f550589f = "";

    /* renamed from: g, reason: collision with root package name */
    public z01.h0 f550590g = z01.h0.f550580d;

    /* renamed from: h, reason: collision with root package name */
    public int f550591h;

    public final void a(boolean z17) {
        if (!z17) {
            this.f550588e = false;
            this.f550589f = "";
        } else {
            if (this.f550588e) {
                return;
            }
            this.f550588e = true;
            this.f550589f = this.f550590g == z01.h0.f550581e ? "原视频" : "已完成";
        }
    }

    /* renamed from: clone */
    public java.lang.Object m178247x5a5dd5d() {
        return super.clone();
    }
}
