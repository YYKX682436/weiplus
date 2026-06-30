package ae2;

/* loaded from: classes3.dex */
public final class ck extends ob2.a {

    /* renamed from: u, reason: collision with root package name */
    public int f85068u;

    public ck() {
        super(0, "TRTC画面渲染优化开关 - 重启生效", null, null, 12, null);
        this.f85068u = -1;
    }

    @Override // lb2.j
    public java.lang.Object r() {
        if (this.f85068u == -1) {
            this.f85068u = ((java.lang.Number) super.r()).intValue();
        }
        return java.lang.Integer.valueOf(this.f85068u);
    }
}
