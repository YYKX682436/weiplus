package com.tencent.mm.feature.ecs.kfproductcard.view;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/feature/ecs/kfproductcard/view/EcsKfProductCardItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ecs_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class EcsKfProductCardItemView extends android.widget.FrameLayout {

    /* renamed from: d */
    public final com.tencent.mm.ui.MMImageView f65639d;

    /* renamed from: e */
    public final com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView f65640e;

    /* renamed from: f */
    public final com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView f65641f;

    /* renamed from: g */
    public final com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView f65642g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public EcsKfProductCardItemView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public static /* synthetic */ bw5.p9 b(com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView ecsKfProductCardItemView, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Integer num, boolean z17, java.lang.Integer num2, int i18, java.lang.Object obj) {
        return ecsKfProductCardItemView.a(str, str2, str3, i17, num, z17, (i18 & 64) != 0 ? null : num2);
    }

    public final bw5.p9 a(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.Integer num, boolean z17, java.lang.Integer num2) {
        bw5.p9 p9Var = new bw5.p9();
        p9Var.d(1);
        bw5.d9 d9Var = new bw5.d9();
        bw5.a9 a9Var = new bw5.a9();
        java.util.LinkedList linkedList = a9Var.f25087d;
        bw5.c9 c9Var = new bw5.c9();
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        c9Var.e(str);
        c9Var.f(str2);
        c9Var.g(str3);
        c9Var.d(i17);
        boolean[] zArr = c9Var.f25987t;
        if (num != null) {
            c9Var.f25979i = num.intValue();
            zArr[6] = true;
        }
        c9Var.f25978h = z17 ? 500 : 400;
        zArr[5] = true;
        if (num2 != null) {
            c9Var.f25980m = num2.intValue();
            zArr[7] = true;
        }
        linkedList.add(c9Var);
        d9Var.c(a9Var);
        p9Var.c(d9Var);
        return p9Var;
    }

    public /* synthetic */ EcsKfProductCardItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EcsKfProductCardItemView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.e4f, (android.view.ViewGroup) this, true);
        setBackgroundResource(com.tencent.mm.R.drawable.czy);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f484145t62);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f65639d = (com.tencent.mm.ui.MMImageView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f484148t65);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f65640e = (com.tencent.mm.feature.ecs.product.view.EcsRichTextLabelView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f484144t61);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f65641f = (com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f484146t63);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f65642g = (com.tencent.mm.feature.ecs.product.view.EcsLabelBoxView) findViewById4;
        android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
        setLayoutParams(layoutParams == null ? new android.view.ViewGroup.LayoutParams(-1, -2) : layoutParams);
    }
}
