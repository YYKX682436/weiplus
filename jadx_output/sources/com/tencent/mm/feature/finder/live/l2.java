package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class l2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f66808d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f66809e;

    /* renamed from: f, reason: collision with root package name */
    public int f66810f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f66811g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f66812h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.v4 f66813i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66814m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66815n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f66816o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(long j17, com.tencent.mm.feature.finder.live.v4 v4Var, android.content.Context context, java.lang.String str, android.widget.ImageView imageView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f66812h = j17;
        this.f66813i = v4Var;
        this.f66814m = context;
        this.f66815n = str;
        this.f66816o = imageView;
    }

    public static final void a(android.widget.ImageView imageView, int i17) {
        int i18 = ws5.i.f449217a;
        int i19 = i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? i17 != 5 ? 0 : com.tencent.mm.R.drawable.bqk : com.tencent.mm.R.drawable.bqj : com.tencent.mm.R.drawable.bqi : com.tencent.mm.R.drawable.bqh : com.tencent.mm.R.drawable.bqg;
        if (i19 == 0) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i19);
            imageView.setVisibility(0);
        }
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.feature.finder.live.l2 l2Var = new com.tencent.mm.feature.finder.live.l2(this.f66812h, this.f66813i, this.f66814m, this.f66815n, this.f66816o, continuation);
        l2Var.f66811g = obj;
        return l2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.finder.live.l2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0179 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x018e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x017a -> B:6:0x0180). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.l2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
