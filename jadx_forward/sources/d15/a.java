package d15;

/* loaded from: classes9.dex */
public class a extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f307280d;

    public a() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "display_name"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "icon_url"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "schedule_showall"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "schedule_remindsubtype"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "schedule_username"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(-1, "schedule_messvrid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.n(-1, "schedule_sourceid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "schedule_content"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "schedule_time"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "schedule_nickname")});
        this.f307280d = mo75927x8ded05a8;
        super.m126741x8589bfe1("mmschedule");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{null, null, 0, 0, null, null, null, null, null, null});
    }

    public java.lang.String j() {
        return super.m75945x2fec8307(this.f307280d + 7);
    }

    public java.lang.Long k() {
        return super.m126714xd97c9941(this.f307280d + 5);
    }

    public java.lang.String l() {
        return super.m75945x2fec8307(this.f307280d + 8);
    }

    public java.lang.String n() {
        return super.m75945x2fec8307(this.f307280d + 4);
    }

    @Override // e14.l
    /* renamed from: processXmlValueUseCData */
    public boolean mo9591x1c1437af(java.lang.Object value, java.lang.String tagName, java.lang.String itemTagName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagName, "tagName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemTagName, "itemTagName");
        return !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tagName, "schedule_showall");
    }
}
