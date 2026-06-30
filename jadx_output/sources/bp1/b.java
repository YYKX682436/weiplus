package bp1;

/* loaded from: classes.dex */
public final class b implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f23038a;

    public b(kotlinx.coroutines.q qVar) {
        this.f23038a = qVar;
    }

    @Override // j35.b0
    public final void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.o.d(iArr);
        int length = iArr.length;
        boolean z17 = false;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                break;
            }
            if (iArr[i18] != 0) {
                z17 = true;
                break;
            }
            i18++;
        }
        kotlinx.coroutines.q qVar = this.f23038a;
        if (z17) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
        } else {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            qVar.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
        }
    }
}
