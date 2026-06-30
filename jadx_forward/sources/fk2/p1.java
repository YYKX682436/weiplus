package fk2;

/* loaded from: classes3.dex */
public final class p1 extends fk2.v {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f344984n = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x023f, code lost:
    
        if (r2 != null) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01be A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a1  */
    @Override // we2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r34, bm2.h1 r35, dk2.zf r36, int r37) {
        /*
            Method dump skipped, instructions count: 892
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk2.p1.d(android.content.Context, bm2.h1, dk2.zf, int):void");
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.ia(msg);
    }

    @Override // we2.o
    public int n() {
        return 20128;
    }

    @Override // we2.o
    public void p(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17, java.util.List payloads) {
        dk2.zf t17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        se2.w.f488428a.n(holder, msg, payloads);
        dk2.ia iaVar = msg instanceof dk2.ia ? (dk2.ia) msg : null;
        if (iaVar == null || (t17 = iaVar.t()) == null) {
            return;
        }
        s(context, holder, t17);
    }
}
