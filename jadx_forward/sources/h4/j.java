package h4;

/* loaded from: classes11.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final u26.y0 f360203a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f360204b;

    public j(u26.y0 channel, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        this.f360203a = channel;
        this.f360204b = z17;
    }

    /* renamed from: equals */
    public boolean m132838xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4.j)) {
            return false;
        }
        h4.j jVar = (h4.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f360203a, jVar.f360203a) && this.f360204b == jVar.f360204b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: hashCode */
    public int m132839x8cdac1b() {
        u26.y0 y0Var = this.f360203a;
        int hashCode = (y0Var != null ? y0Var.hashCode() : 0) * 31;
        boolean z17 = this.f360204b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        return hashCode + i17;
    }

    /* renamed from: toString */
    public java.lang.String m132840x9616526c() {
        return "ChannelEntry(channel=" + this.f360203a + ", _receivedValue=" + this.f360204b + ")";
    }
}
