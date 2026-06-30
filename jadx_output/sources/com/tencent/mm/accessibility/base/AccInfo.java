package com.tencent.mm.accessibility.base;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\b\"\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/accessibility/base/AccInfo;", "", "viewIdResourceName", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "contentDescription", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContentDescription", "()Ljava/lang/String;", "hintText", "getHintText", "setHintText", "(Ljava/lang/String;)V", "getText", "getViewIdResourceName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class AccInfo {
    public static final int $stable = 8;
    private final java.lang.String contentDescription;
    private java.lang.String hintText;
    private final java.lang.String text;
    private final java.lang.String viewIdResourceName;

    public AccInfo() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ com.tencent.mm.accessibility.base.AccInfo copy$default(com.tencent.mm.accessibility.base.AccInfo accInfo, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            str = accInfo.viewIdResourceName;
        }
        if ((i17 & 2) != 0) {
            str2 = accInfo.text;
        }
        if ((i17 & 4) != 0) {
            str3 = accInfo.contentDescription;
        }
        return accInfo.copy(str, str2, str3);
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

    public final com.tencent.mm.accessibility.base.AccInfo copy(java.lang.String viewIdResourceName, java.lang.String text, java.lang.String contentDescription) {
        return new com.tencent.mm.accessibility.base.AccInfo(viewIdResourceName, text, contentDescription);
    }

    public boolean equals(java.lang.Object other) {
        return other != null && hashCode() == other.hashCode();
    }

    public final java.lang.String getContentDescription() {
        return this.contentDescription;
    }

    public final java.lang.String getHintText() {
        return this.hintText;
    }

    public final java.lang.String getText() {
        return this.text;
    }

    public final java.lang.String getViewIdResourceName() {
        return this.viewIdResourceName;
    }

    public int hashCode() {
        return (this.viewIdResourceName + this.text + this.contentDescription + this.hintText).hashCode();
    }

    public final void setHintText(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.hintText = str;
    }

    public java.lang.String toString() {
        return "AccInfo(viewIdResourceName=" + this.viewIdResourceName + ", text=" + this.text + ", contentDescription=" + this.contentDescription + ')';
    }

    public AccInfo(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.viewIdResourceName = str;
        this.text = str2;
        this.contentDescription = str3;
        this.hintText = "";
    }

    public /* synthetic */ AccInfo(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3);
    }
}
