package com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/handoff/model/AbsHandOffFile;", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "Companion", "e73/a", "handoff-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.handoff.model.AbsHandOffFile */
/* loaded from: classes12.dex */
public abstract class AbstractC16084xdca2b46a extends com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 {

    /* renamed from: Companion */
    public static final e73.a f37024x233c02ec = new e73.a(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC16084xdca2b46a(android.os.Parcel source) {
        super(source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
    }

    /* renamed from: getFileStatus */
    public abstract int mo65010x599c5c84();

    /* renamed from: getFullPath */
    public abstract java.lang.String mo65011xcb2e58ca();

    /* renamed from: getSize */
    public abstract long mo65012xfb854877();

    /* renamed from: saveToMultiTaskInfo */
    public abstract void mo65013xf5a3a234(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c);

    /* renamed from: setFileStatus */
    public abstract void mo65014x87c0aa90(int i17);

    /* renamed from: setFullPath */
    public abstract void mo65015xc5e6b9d6(java.lang.String str);

    /* renamed from: setSource */
    public abstract void mo65016x22dcbf1d(int i17);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public AbstractC16084xdca2b46a(int r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, long r19, int r21, p3321xbce91901.jvm.p3324x21ffc6bd.i r22) {
        /*
            r13 = this;
            r0 = r21 & 16
            if (r0 == 0) goto L14
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            r7 = r0
            goto L16
        L14:
            r7 = r18
        L16:
            r0 = r21 & 32
            if (r0 == 0) goto L20
            long r0 = java.lang.System.currentTimeMillis()
            r8 = r0
            goto L22
        L20:
            r8 = r19
        L22:
            java.lang.String r0 = "from"
            r1 = r15
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r0)
            java.lang.String r0 = "to"
            r5 = r16
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "key"
            r6 = r17
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "id"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r0)
            r10 = 0
            r11 = 64
            r12 = 0
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16084xdca2b46a.<init>(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, int, kotlin.jvm.internal.i):void");
    }
}
