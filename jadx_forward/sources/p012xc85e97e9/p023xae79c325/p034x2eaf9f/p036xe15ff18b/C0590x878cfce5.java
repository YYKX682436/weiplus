package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b;

/* renamed from: androidx.camera.core.imagecapture.AutoValue_ProcessingNode_InputPacket */
/* loaded from: classes14.dex */
final class C0590x878cfce5 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket {

    /* renamed from: imageProxy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 f1313xa92cd1d3;

    /* renamed from: processingRequest */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc f1314xd510cffc;

    public C0590x878cfce5(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc c0627xbfd50fdc, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        if (c0627xbfd50fdc == null) {
            throw new java.lang.NullPointerException("Null processingRequest");
        }
        this.f1314xd510cffc = c0627xbfd50fdc;
        if (interfaceC0536x1ffeadf3 == null) {
            throw new java.lang.NullPointerException("Null imageProxy");
        }
        this.f1313xa92cd1d3 = interfaceC0536x1ffeadf3;
    }

    /* renamed from: equals */
    public boolean m4902xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket)) {
            return false;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket inputPacket = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket) obj;
        return this.f1314xd510cffc.equals(inputPacket.mo4904x28455746()) && this.f1313xa92cd1d3.equals(inputPacket.mo4903x976d89c9());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket
    /* renamed from: getImageProxy */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4903x976d89c9() {
        return this.f1313xa92cd1d3;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0618xcff25bd5.InputPacket
    /* renamed from: getProcessingRequest */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p036xe15ff18b.C0627xbfd50fdc mo4904x28455746() {
        return this.f1314xd510cffc;
    }

    /* renamed from: hashCode */
    public int m4905x8cdac1b() {
        return ((this.f1314xd510cffc.hashCode() ^ 1000003) * 1000003) ^ this.f1313xa92cd1d3.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m4906x9616526c() {
        return "InputPacket{processingRequest=" + this.f1314xd510cffc + ", imageProxy=" + this.f1313xa92cd1d3 + "}";
    }
}
