package c61;

/* loaded from: classes8.dex */
public final class mb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f39168d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f39169e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f39170f;

    /* renamed from: g, reason: collision with root package name */
    public int f39171g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c61.ob f39172h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f39173i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f39174m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f39175n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ io.flutter.plugin.common.MethodChannel.Result f39176o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(c61.ob obVar, int i17, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, io.flutter.plugin.common.MethodChannel.Result result, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f39172h = obVar;
        this.f39173i = i17;
        this.f39174m = arrayList;
        this.f39175n = arrayList2;
        this.f39176o = result;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new c61.mb(this.f39172h, this.f39173i, this.f39174m, this.f39175n, this.f39176o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((c61.mb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0064  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c61.mb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
