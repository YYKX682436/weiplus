package com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017BY\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0010\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/handoff/model/HandOffMG;", "Lcom/tencent/mm/plugin/handoff/model/HandOffMP;", "", "getDataType", "Lcom/tencent/mm/plugin/handoff/model/HandOff;", "copy", "", "icon", com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "appID", "appEntryPage", "appUserName", "handOffType", "from", "to", "key", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()V", "Landroid/os/Parcel;", ya.b.f77502x92235c1b, "(Landroid/os/Parcel;)V", "Companion", "e73/o", "api-handoff_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.handoff.model.HandOffMG */
/* loaded from: classes15.dex */
public final class C16090x79ac73fa extends com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16091x79ac7403 {

    /* renamed from: Companion */
    public static final e73.o f37088x233c02ec = new e73.o(null);

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16090x79ac73fa> f37087x681a0c0c = new e73.n();

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16090x79ac73fa(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName) {
        this(icon, title, appID, appEntryPage, appUserName, 0, null, null, null, 480, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appID, "appID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appEntryPage, "appEntryPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appUserName, "appUserName");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16091x79ac7403, com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260
    /* renamed from: copy */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260 mo65021x2eaf75() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16090x79ac73fa c16090x79ac73fa = new com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16090x79ac73fa(getIcon(), getTitle(), getAppID(), getAppEntryPage(), getAppUserName(), getHandOffType(), getFrom(), getTo(), getKey());
        c16090x79ac73fa.m65040x684351d(getId());
        return c16090x79ac73fa;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16091x79ac7403, com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260
    /* renamed from: getDataType */
    public int mo65028xe67d4b7a() {
        return 4;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16090x79ac73fa(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName, int i17) {
        this(icon, title, appID, appEntryPage, appUserName, i17, null, null, null, com.p314xaae8f345.p3121x37984a.C26884x28705875.f57795xccece4df, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appID, "appID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appEntryPage, "appEntryPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appUserName, "appUserName");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16090x79ac73fa(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName, int i17, java.lang.String from) {
        this(icon, title, appID, appEntryPage, appUserName, i17, from, null, null, 384, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appID, "appID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appEntryPage, "appEntryPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appUserName, "appUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C16090x79ac73fa(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName, int i17, java.lang.String from, java.lang.String to6) {
        this(icon, title, appID, appEntryPage, appUserName, i17, from, to6, null, 256, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appID, "appID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appEntryPage, "appEntryPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appUserName, "appUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16090x79ac73fa(java.lang.String icon, java.lang.String title, java.lang.String appID, java.lang.String appEntryPage, java.lang.String appUserName, int i17, java.lang.String from, java.lang.String to6, java.lang.String key) {
        super(icon, title, appID, appEntryPage, appUserName, i17, from, to6, key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(icon, "icon");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appID, "appID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appEntryPage, "appEntryPage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appUserName, "appUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(from, "from");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(to6, "to");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C16090x79ac73fa(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, int r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, p3321xbce91901.jvm.p3324x21ffc6bd.i r23) {
        /*
            r12 = this;
            r0 = r22
            r1 = r0 & 32
            if (r1 == 0) goto L9
            r1 = 1
            r8 = r1
            goto Lb
        L9:
            r8 = r18
        Lb:
            r1 = r0 & 64
            java.lang.String r2 = ""
            if (r1 == 0) goto L13
            r9 = r2
            goto L15
        L13:
            r9 = r19
        L15:
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L1b
            r10 = r2
            goto L1d
        L1b:
            r10 = r20
        L1d:
            r0 = r0 & 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L2a
            e73.b r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.AbstractC16085x8c838260.f37025x233c02ec
            r1 = 4
            java.lang.String r0 = r0.a(r1, r8)
            r11 = r0
            goto L2c
        L2a:
            r11 = r21
        L2c:
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1773x294b62a0.p1774x633fb29.C16090x79ac73fa.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    public C16090x79ac73fa() {
        this("", "", "", "", "", 0, null, null, null, 480, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16090x79ac73fa(android.os.Parcel source) {
        super(source);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
    }
}
