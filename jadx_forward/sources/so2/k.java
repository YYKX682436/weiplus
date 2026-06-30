package so2;

/* loaded from: classes2.dex */
public final class k implements so2.j5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ja0 f491984d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ja0 mixItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mixItem, "mixItem");
        this.f491984d = mixItem;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = mixItem.f208527c;
        if (c14994x9b99c079 != null) {
            cu2.u.f303974a.p(c14994x9b99c079);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0.b(), r11.b()) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
    
        if (r1 == r7) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r0.m59260x51f8f5b0() == r11.m59260x51f8f5b0()) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.r0 r11) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: so2.k.d(com.tencent.mm.plugin.finder.feed.model.internal.r0):int");
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return this.f491984d.f208531g;
    }

    @Override // in5.c
    public int h() {
        return this.f491984d.f208530f;
    }

    /* renamed from: toString */
    public java.lang.String m164907x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("ItemId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ja0 ja0Var = this.f491984d;
        sb6.append(ja0Var.f208531g);
        sb6.append(",ItemType=");
        sb6.append(ja0Var.f208530f);
        sb6.append(' ');
        return sb6.toString();
    }
}
