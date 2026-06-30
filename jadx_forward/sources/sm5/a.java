package sm5;

/* loaded from: classes10.dex */
public final class a implements com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rm5.j f491492a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sm5.b f491493b;

    public a(rm5.j jVar, sm5.b bVar) {
        this.f491492a = jVar;
        this.f491493b = bVar;
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7
    /* renamed from: createAudioProcessor */
    public com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7.TAVAudioProcessorEffect mo98604x8177c578() {
        l55.b bVar = (l55.b) this.f491493b.f491494a;
        bVar.getClass();
        rm5.j track = this.f491492a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(track, "track");
        return new l55.a(bVar, track);
    }

    @Override // com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2974x58d9bd6.InterfaceC25879x655c64e7
    /* renamed from: getIdentifier */
    public java.lang.String mo98605x8dc9649f() {
        return this.f491492a.f479032a;
    }
}
