package by0;

/* loaded from: classes3.dex */
public final class d implements dr.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f36324a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.api.IEmojiInfo f36325b;

    public d(kotlinx.coroutines.q qVar, com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        this.f36324a = qVar;
        this.f36325b = iEmojiInfo;
    }

    @Override // dr.q
    public void a(boolean z17) {
        kotlinx.coroutines.q qVar = this.f36324a;
        if (!z17) {
            qVar.resumeWith(kotlin.Result.m521constructorimpl(null));
        } else {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(this.f36325b));
        }
    }
}
