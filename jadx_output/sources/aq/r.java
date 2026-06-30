package aq;

/* loaded from: classes4.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f12935d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f12936e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f12937f;

    /* renamed from: g, reason: collision with root package name */
    public int f12938g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f12939h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.util.ArrayList arrayList, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12939h = arrayList;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new aq.r(this.f12939h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.r) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0086 -> B:12:0x008b). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aq.r.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
