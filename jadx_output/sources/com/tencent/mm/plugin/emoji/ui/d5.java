package com.tencent.mm.plugin.emoji.ui;

/* loaded from: classes10.dex */
public final class d5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f97931d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f97932e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f97933f;

    /* renamed from: g, reason: collision with root package name */
    public int f97934g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f97935h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity f97936i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(java.util.List list, com.tencent.mm.plugin.emoji.ui.MultiEmojiEditorActivity multiEmojiEditorActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f97935h = list;
        this.f97936i = multiEmojiEditorActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.emoji.ui.d5(this.f97935h, this.f97936i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.emoji.ui.d5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:(1:30)|31|33|34|36|37|38|39|40|41|42|43|(1:45)(12:46|15|16|17|(0)|20|(0)|23|(0)|26|27|(4:80|(1:82)|6|7)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(13:11|(3:12|13|14)|15|16|17|(1:19)|20|(1:22)|23|(1:25)|26|27|(14:29|30|31|33|34|36|37|38|39|40|41|42|43|(1:45)(12:46|15|16|17|(0)|20|(0)|23|(0)|26|27|(4:80|(1:82)|6|7)(0)))(0)) */
    /* JADX WARN: Can't wrap try/catch for region: R(14:29|30|31|33|34|36|37|38|39|40|41|42|43|(1:45)(12:46|15|16|17|(0)|20|(0)|23|(0)|26|27|(4:80|(1:82)|6|7)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009d, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        r3 = r6;
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00de, code lost:
    
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e5, code lost:
    
        r0.recycle();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ea, code lost:
    
        r6 = r3;
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ac, code lost:
    
        r6 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x009f, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b1, code lost:
    
        r20 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00a1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00a2, code lost:
    
        r20 = r15;
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00a6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00a7, code lost:
    
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0099, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0105  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x0084 -> B:15:0x0087). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.emoji.ui.d5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
