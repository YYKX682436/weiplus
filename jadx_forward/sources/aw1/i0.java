package aw1;

/* loaded from: classes10.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f96065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.CancellationSignal f96066e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96067f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96068g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96069h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f96070i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f96071m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f96072n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f96073o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f96074p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f96075q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96076r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicLong f96077s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ExecutorService f96078t;

    public i0(java.util.List list, android.os.CancellationSignal cancellationSignal, java.util.concurrent.atomic.AtomicLong atomicLong, java.util.concurrent.atomic.AtomicLong atomicLong2, java.util.concurrent.atomic.AtomicLong atomicLong3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var4, java.util.concurrent.atomic.AtomicInteger atomicInteger, int i17, java.util.concurrent.atomic.AtomicLong atomicLong4, java.util.concurrent.atomic.AtomicLong atomicLong5, java.util.concurrent.ExecutorService executorService) {
        this.f96065d = list;
        this.f96066e = cancellationSignal;
        this.f96067f = atomicLong;
        this.f96068g = atomicLong2;
        this.f96069h = atomicLong3;
        this.f96070i = h0Var;
        this.f96071m = h0Var2;
        this.f96072n = h0Var3;
        this.f96073o = h0Var4;
        this.f96074p = atomicInteger;
        this.f96075q = i17;
        this.f96076r = atomicLong4;
        this.f96077s = atomicLong5;
        this.f96078t = executorService;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:153|(1:155)|156|(4:158|159|160|(22:162|163|164|165|166|167|168|169|(1:171)(1:217)|172|(2:174|(1:176)(11:213|(1:179)|(1:181)(2:204|(6:206|207|208|209|117|118))|182|183|184|185|186|187|188|189))(2:214|(1:216))|177|(0)|(0)(0)|182|183|184|185|186|187|188|189))|228|169|(0)(0)|172|(0)(0)|177|(0)|(0)(0)|182|183|184|185|186|187|188|189) */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0439, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0412, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0413, code lost:
    
        r2 = r41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0416, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x0645, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01ff A[Catch: all -> 0x0423, TryCatch #1 {all -> 0x0423, blocks: (B:130:0x01eb, B:132:0x01f3, B:137:0x01ff, B:139:0x0227, B:140:0x022e, B:142:0x0232, B:147:0x023e, B:149:0x0248, B:150:0x0284, B:151:0x029f, B:153:0x02bc, B:155:0x02d7, B:156:0x02df, B:230:0x024d), top: B:129:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02bc A[Catch: all -> 0x0423, TryCatch #1 {all -> 0x0423, blocks: (B:130:0x01eb, B:132:0x01f3, B:137:0x01ff, B:139:0x0227, B:140:0x022e, B:142:0x0232, B:147:0x023e, B:149:0x0248, B:150:0x0284, B:151:0x029f, B:153:0x02bc, B:155:0x02d7, B:156:0x02df, B:230:0x024d), top: B:129:0x01eb }] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0357 A[Catch: all -> 0x041c, TryCatch #13 {all -> 0x041c, blocks: (B:168:0x0301, B:169:0x0328, B:172:0x0339, B:174:0x0357, B:179:0x037b, B:181:0x0381, B:204:0x03b9, B:214:0x036b, B:217:0x0333), top: B:167:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x037b A[Catch: all -> 0x041c, TryCatch #13 {all -> 0x041c, blocks: (B:168:0x0301, B:169:0x0328, B:172:0x0339, B:174:0x0357, B:179:0x037b, B:181:0x0381, B:204:0x03b9, B:214:0x036b, B:217:0x0333), top: B:167:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0381 A[Catch: all -> 0x041c, TryCatch #13 {all -> 0x041c, blocks: (B:168:0x0301, B:169:0x0328, B:172:0x0339, B:174:0x0357, B:179:0x037b, B:181:0x0381, B:204:0x03b9, B:214:0x036b, B:217:0x0333), top: B:167:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0430 A[Catch: all -> 0x0439, TRY_LEAVE, TryCatch #10 {all -> 0x0439, blocks: (B:189:0x040e, B:190:0x0429, B:193:0x0430), top: B:188:0x040e }] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03b9 A[Catch: all -> 0x041c, TRY_LEAVE, TryCatch #13 {all -> 0x041c, blocks: (B:168:0x0301, B:169:0x0328, B:172:0x0339, B:174:0x0357, B:179:0x037b, B:181:0x0381, B:204:0x03b9, B:214:0x036b, B:217:0x0333), top: B:167:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:214:0x036b A[Catch: all -> 0x041c, TryCatch #13 {all -> 0x041c, blocks: (B:168:0x0301, B:169:0x0328, B:172:0x0339, B:174:0x0357, B:179:0x037b, B:181:0x0381, B:204:0x03b9, B:214:0x036b, B:217:0x0333), top: B:167:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0333 A[Catch: all -> 0x041c, TryCatch #13 {all -> 0x041c, blocks: (B:168:0x0301, B:169:0x0328, B:172:0x0339, B:174:0x0357, B:179:0x037b, B:181:0x0381, B:204:0x03b9, B:214:0x036b, B:217:0x0333), top: B:167:0x0301 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x049b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x063c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x04e7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 1615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw1.i0.run():void");
    }
}
