package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes10.dex */
public final class x1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f180086d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f180087e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 f180088f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f180088f = activityC13304x9b00dd62;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x1 x1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x1(this.f180088f, interfaceC29045xdcb5ca57);
        x1Var.f180087e = obj;
        return x1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object c17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f180086d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.ActivityC13304x9b00dd62 activityC13304x9b00dd62 = this.f180088f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f180087e;
            p12.h c76 = activityC13304x9b00dd62.c7();
            this.f180087e = y0Var;
            this.f180086d = 1;
            c17 = c76.c(this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                throw new jz5.d();
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c17 = obj;
        }
        l12.a aVar2 = (l12.a) c17;
        if (aVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EmojiEditorActivity", "failed to setup render view");
            activityC13304x9b00dd62.setResult(0);
            activityC13304x9b00dd62.finish();
            activityC13304x9b00dd62.f179307y = 1L;
            return jz5.f0.f384359a;
        }
        android.view.View findViewById = activityC13304x9b00dd62.findViewById(com.p314xaae8f345.mm.R.id.im7);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupMedia$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/emoji/ui/EmojiEditorActivity$setupMedia$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC13304x9b00dd62.c7().a().addOnLayoutChangeListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v1(activityC13304x9b00dd62));
        activityC13304x9b00dd62.n7(aVar2);
        activityC13304x9b00dd62.f179305w = aVar2 == l12.a.f396514f;
        if (aVar2 == l12.a.f396513e) {
            activityC13304x9b00dd62.B.f137507o++;
        }
        android.util.Size size = (android.util.Size) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) activityC13304x9b00dd62.c7().f432558d).mo144003x754a37bb();
        if (size.getWidth() != 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.ScaleGestureDetectorOnScaleGestureListenerC13256x346a1468 a76 = activityC13304x9b00dd62.a7();
            int width = size.getWidth();
            int height = size.getHeight();
            a76.f178987f = width;
            a76.f178988g = height;
            a76.invalidate();
            activityC13304x9b00dd62.b7().a(size.getWidth(), size.getHeight());
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = activityC13304x9b00dd62.c7().f432558d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.w1 w1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.w1(activityC13304x9b00dd62);
        this.f180087e = null;
        this.f180086d = 2;
        if (((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).a(w1Var, this) == aVar) {
            return aVar;
        }
        throw new jz5.d();
    }
}
