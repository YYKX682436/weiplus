package com.tencent.mm.accessibility.core.provider;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;", "invoke", "(Lcom/tencent/mm/accessibility/base/MMBaseAccessibilityConfig;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ContentDescProvider$getContentDesc$3 extends kotlin.jvm.internal.q implements yz5.l {
    final /* synthetic */ java.lang.Object $content;
    final /* synthetic */ kotlin.jvm.internal.h0 $contentDesc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentDescProvider$getContentDesc$3(kotlin.jvm.internal.h0 h0Var, java.lang.Object obj) {
        super(1);
        this.$contentDesc = h0Var;
        this.$content = obj;
    }

    @Override // yz5.l
    public final java.lang.Boolean invoke(com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig it) {
        kotlin.jvm.internal.o.g(it, "it");
        kotlin.jvm.internal.h0 h0Var = this.$contentDesc;
        java.lang.String str = it.getParamMap$plugin_autoaccessibility_release().get(this.$content);
        if (str == null) {
            return java.lang.Boolean.FALSE;
        }
        h0Var.f310123d = str;
        return java.lang.Boolean.TRUE;
    }
}
