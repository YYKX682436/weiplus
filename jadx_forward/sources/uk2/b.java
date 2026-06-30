package uk2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f510054a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.la4 f510055b;

    /* renamed from: c, reason: collision with root package name */
    public final mn0.l0 f510056c;

    public b(java.lang.String anchorUserName, r45.la4 channelParamsDesc, mn0.l0 playInfoData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserName, "anchorUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channelParamsDesc, "channelParamsDesc");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(playInfoData, "playInfoData");
        this.f510054a = anchorUserName;
        this.f510055b = channelParamsDesc;
        this.f510056c = playInfoData;
    }

    public final java.lang.String a() {
        java.lang.String stream_id = this.f510055b.f460807e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stream_id, "stream_id");
        return stream_id;
    }

    /* renamed from: equals */
    public boolean m168198xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uk2.b)) {
            return false;
        }
        uk2.b bVar = (uk2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510054a, bVar.f510054a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510055b, bVar.f510055b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f510056c, bVar.f510056c);
    }

    /* renamed from: hashCode */
    public int m168199x8cdac1b() {
        return (((this.f510054a.hashCode() * 31) + this.f510055b.hashCode()) * 31) + this.f510056c.m148066x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m168200x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("anchorUserName: ");
        sb6.append(this.f510054a);
        sb6.append(" desc: ");
        r45.la4 la4Var = this.f510055b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(la4Var, "<this>");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("stream_id: ");
        sb7.append(la4Var.f460807e);
        sb7.append(" view_desc: ");
        sb7.append(la4Var.f460808f);
        sb7.append(" params: ");
        r45.ka4 channel_params = la4Var.f460806d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(channel_params, "channel_params");
        sb7.append("streamId: " + channel_params.f460067e + " quality: " + channel_params.f460074n + " videoWidth: " + channel_params.V + " videoHeight: " + channel_params.W + " support_rotate: " + channel_params.f460081s + '}');
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}
