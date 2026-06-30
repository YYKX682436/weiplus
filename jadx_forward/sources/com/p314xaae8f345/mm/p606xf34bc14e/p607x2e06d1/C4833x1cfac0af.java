package com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/accessibility/base/AccInfo;", "", "viewIdResourceName", "", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26514x6b29e485.f54270xd8c04b24, "contentDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentDescription", "()Ljava/lang/String;", "hintText", "getHintText", "setHintText", "(Ljava/lang/String;)V", "getText", "getViewIdResourceName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.base.AccInfo */
/* loaded from: classes14.dex */
public final /* data */ class C4833x1cfac0af {

    /* renamed from: $stable */
    public static final int f20844x3b2de05f = 8;
    private final java.lang.String contentDescription;
    private java.lang.String hintText;
    private final java.lang.String text;
    private final java.lang.String viewIdResourceName;

    public C4833x1cfac0af() {
        this(null, null, null, 7, null);
    }

    /* renamed from: copy$default */
    public static /* synthetic */ com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4833x1cfac0af m42200x75149012(com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4833x1cfac0af c4833x1cfac0af, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = c4833x1cfac0af.viewIdResourceName;
        }
        if ((i17 & 2) != 0) {
            str2 = c4833x1cfac0af.text;
        }
        if ((i17 & 4) != 0) {
            str3 = c4833x1cfac0af.contentDescription;
        }
        return c4833x1cfac0af.m42204x2eaf75(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getViewIdResourceName() {
        return this.viewIdResourceName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    /* renamed from: copy */
    public final com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4833x1cfac0af m42204x2eaf75(java.lang.String viewIdResourceName, java.lang.String text, java.lang.String contentDescription) {
        return new com.p314xaae8f345.mm.p606xf34bc14e.p607x2e06d1.C4833x1cfac0af(viewIdResourceName, text, contentDescription);
    }

    /* renamed from: equals */
    public boolean m42205xb2c87fbf(java.lang.Object other) {
        return other != null && m42210x8cdac1b() == other.hashCode();
    }

    /* renamed from: getContentDescription */
    public final java.lang.String m42206xc77303b9() {
        return this.contentDescription;
    }

    public final java.lang.String getHintText() {
        return this.hintText;
    }

    /* renamed from: getText */
    public final java.lang.String m42208xfb85ada3() {
        return this.text;
    }

    /* renamed from: getViewIdResourceName */
    public final java.lang.String m42209xe1df06f() {
        return this.viewIdResourceName;
    }

    /* renamed from: hashCode */
    public int m42210x8cdac1b() {
        return (this.viewIdResourceName + this.text + this.contentDescription + this.hintText).hashCode();
    }

    /* renamed from: setHintText */
    public final void m42211x1eba9ad6(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.hintText = str;
    }

    /* renamed from: toString */
    public java.lang.String m42212x9616526c() {
        return "AccInfo(viewIdResourceName=" + this.viewIdResourceName + ", text=" + this.text + ", contentDescription=" + this.contentDescription + ')';
    }

    public C4833x1cfac0af(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.viewIdResourceName = str;
        this.text = str2;
        this.contentDescription = str3;
        this.hintText = "";
    }

    public /* synthetic */ C4833x1cfac0af(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
    }
}
