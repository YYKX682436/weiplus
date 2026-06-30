package st3;

/* loaded from: classes10.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f494120a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f494121b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f494122c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f494123d;

    /* renamed from: e, reason: collision with root package name */
    public final float[] f494124e;

    /* renamed from: f, reason: collision with root package name */
    public final int f494125f;

    /* renamed from: g, reason: collision with root package name */
    public final int f494126g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f494127h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f494128i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f494129j;

    public s(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, java.util.ArrayList editItems, java.util.ArrayList editData, float[] drawingRect, int i17, int i18, java.util.ArrayList fakeImagesList, java.lang.String str, float[] validRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editItems, "editItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editData, "editData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawingRect, "drawingRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fakeImagesList, "fakeImagesList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(validRect, "validRect");
        this.f494120a = z17;
        this.f494121b = c16997xb0aa383a;
        this.f494122c = editItems;
        this.f494123d = editData;
        this.f494124e = drawingRect;
        this.f494125f = i17;
        this.f494126g = i18;
        this.f494127h = fakeImagesList;
        this.f494128i = str;
        this.f494129j = validRect;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r5 != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final st3.r a(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 r26, ct0.b r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st3.s.a(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, ct0.b, boolean):st3.r");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0151, code lost:
    
        r0 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final st3.r b(java.lang.String r18, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 r19, st3.r r20) {
        /*
            Method dump skipped, instructions count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: st3.s.b(java.lang.String, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider, st3.r):st3.r");
    }

    /* renamed from: toString */
    public java.lang.String m165239x9616526c() {
        return "RemuxMediaEditConfig(muteOrigin=" + this.f494120a + ", audioCacheInfo=" + this.f494121b + ", editItems=" + this.f494122c + ", drawingRect=" + java.util.Arrays.toString(this.f494124e) + ", reMuxStartTimeMs=" + this.f494125f + ", reMuxEndTimeMs=" + this.f494126g + ')';
    }

    public /* synthetic */ s(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, float[] fArr, int i17, int i18, java.util.ArrayList arrayList3, java.lang.String str, float[] fArr2, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i19 & 1) != 0 ? false : z17, (i19 & 2) != 0 ? null : c16997xb0aa383a, (i19 & 4) != 0 ? new java.util.ArrayList() : arrayList, (i19 & 8) != 0 ? new java.util.ArrayList() : arrayList2, (i19 & 16) != 0 ? new float[]{0.0f, 0.0f, 0.0f, 0.0f} : fArr, (i19 & 32) != 0 ? 0 : i17, (i19 & 64) != 0 ? 0 : i18, (i19 & 128) != 0 ? new java.util.ArrayList() : arrayList3, (i19 & 256) != 0 ? null : str, fArr2);
    }
}
