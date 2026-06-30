package ca4;

/* loaded from: classes4.dex */
public final class a1 implements com.tencent.mm.pluginsdk.ui.span.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f39817a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39818b;

    public a1(yz5.p pVar, java.lang.String str) {
        this.f39817a = pVar;
        this.f39818b = str;
    }

    @Override // com.tencent.mm.pluginsdk.ui.span.c1
    public final void a(android.view.View view, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getDisplayRemarkSpan$snsSpan$1");
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f39817a.invoke(context, this.f39818b);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onClick", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getDisplayRemarkSpan$snsSpan$1");
    }
}
