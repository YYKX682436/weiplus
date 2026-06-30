package cd0;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {
    public final /* synthetic */ java.util.ArrayList A;
    public final /* synthetic */ long B;
    public final /* synthetic */ java.util.List C;
    public final /* synthetic */ java.lang.String D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ java.lang.ref.WeakReference F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ java.lang.String H;

    /* renamed from: d, reason: collision with root package name */
    public boolean f40572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f40573e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f40574f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f40575g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f40576h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f40577i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f40578m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f40579n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f40580o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.Object f40581p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Object f40582q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f40583r;

    /* renamed from: s, reason: collision with root package name */
    public long f40584s;

    /* renamed from: t, reason: collision with root package name */
    public int f40585t;

    /* renamed from: u, reason: collision with root package name */
    public int f40586u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ java.util.List f40587v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r45.ng f40588w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f40589x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f40590y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f40591z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(java.util.List list, r45.ng ngVar, kotlin.jvm.internal.f0 f0Var, java.util.ArrayList arrayList, com.tencent.mm.storage.f9 f9Var, java.util.ArrayList arrayList2, long j17, java.util.List list2, java.lang.String str, boolean z17, java.lang.ref.WeakReference weakReference, boolean z18, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f40587v = list;
        this.f40588w = ngVar;
        this.f40589x = f0Var;
        this.f40590y = arrayList;
        this.f40591z = f9Var;
        this.A = arrayList2;
        this.B = j17;
        this.C = list2;
        this.D = str;
        this.E = z17;
        this.F = weakReference;
        this.G = z18;
        this.H = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cd0.s(this.f40587v, this.f40588w, this.f40589x, this.f40590y, this.f40591z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((cd0.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x022d, code lost:
    
        if ((r7 != null && r7.h2() == 1) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0b96  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x09a6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0b98  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x044a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0af5  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0af8  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x098a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x099a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x099d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x05f5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:221:0x014e -> B:168:0x0161). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:222:0x0176 -> B:169:0x0187). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:224:0x01dc -> B:173:0x01f1). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r47) {
        /*
            Method dump skipped, instructions count: 3046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cd0.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
