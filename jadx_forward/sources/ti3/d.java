package ti3;

/* loaded from: classes9.dex */
public final class d extends com.p314xaae8f345.mm.sdk.p2603x2137b148.w3 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f501115b;

    /* renamed from: c, reason: collision with root package name */
    public final g15.b f501116c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f501117d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x3 type, java.lang.String talker, g15.b bVar, java.lang.String modifyFrom) {
        super(type, "");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(modifyFrom, "modifyFrom");
        this.f501115b = talker;
        this.f501116c = bVar;
        this.f501117d = modifyFrom;
    }

    /* renamed from: toString */
    public java.lang.String m166636x9616526c() {
        return "DraftChangeEvent(type=" + this.f274581a + ", talker='" + this.f501115b + "', newDraftInfo=" + this.f501116c + ", modifyFrom='" + this.f501117d + "')";
    }
}
