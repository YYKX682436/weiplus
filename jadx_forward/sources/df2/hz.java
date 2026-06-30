package df2;

/* loaded from: classes3.dex */
public final class hz implements ie2.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lz f311898d;

    public hz(df2.lz lzVar) {
        this.f311898d = lzVar;
    }

    @Override // ie2.h
    public void j() {
        r45.c8 c8Var;
        df2.lz lzVar = this.f311898d;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) lzVar.S6(com.p314xaae8f345.mm.R.id.r6v);
        if (viewGroup != null) {
            viewGroup.setVisibility(0);
        }
        android.widget.TextView c76 = lzVar.c7();
        if (c76 != null) {
            c76.setTextSize(2, 10.0f);
        }
        r45.aq4 aq4Var = (r45.aq4) ((mm2.f6) lzVar.m56788xbba4bfc0(mm2.f6.class)).B1.mo3195x754a37bb();
        lzVar.e7((aq4Var == null || (c8Var = (r45.c8) aq4Var.m75936x14adae67(3)) == null) ? null : c8Var.m75945x2fec8307(0), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ie2.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof df2.fz
            if (r0 == 0) goto L13
            r0 = r7
            df2.fz r0 = (df2.fz) r0
            int r1 = r0.f311712g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f311712g = r1
            goto L18
        L13:
            df2.fz r0 = new df2.fz
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.f311710e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f311712g
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            java.lang.Object r0 = r0.f311709d
            df2.hz r0 = (df2.hz) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L40
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            r0.f311709d = r6
            r0.f311712g = r4
            if (r3 != r1) goto L3f
            return r1
        L3f:
            r0 = r6
        L40:
            df2.lz r7 = r0.f311898d
            com.tencent.mm.view.MMPAGView r0 = r7.a7()
            r1 = 0
            if (r0 == 0) goto L4e
            android.graphics.Bitmap r0 = r0.m82573x12501425()
            goto L4f
        L4e:
            r0 = r1
        L4f:
            r2 = 2131302135(0x7f0916f7, float:1.8222348E38)
            android.view.View r4 = r7.m124230x4ff8c0f0(r2)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r5 = 0
            if (r4 == 0) goto L61
            r4.setVisibility(r5)
            r4.setImageBitmap(r0)
        L61:
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r4 = r7.b7()
            if (r4 == 0) goto L7b
            android.view.ViewGroup r4 = r4.m56779x33bfba91()
            if (r4 == 0) goto L7b
            android.view.View r2 = r4.findViewById(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            if (r2 == 0) goto L7b
            r2.setVisibility(r5)
            r2.setImageBitmap(r0)
        L7b:
            com.tencent.mm.plugin.finder.live.bubble.FrameBubbleContentLayout r0 = r7.b7()
            if (r0 == 0) goto L91
            android.view.ViewGroup r0 = r0.m56779x33bfba91()
            if (r0 == 0) goto L91
            r2 = 2131321486(0x7f09628e, float:1.8261596E38)
            android.view.View r0 = r0.findViewById(r2)
            android.widget.TextView r0 = (android.widget.TextView) r0
            goto L92
        L91:
            r0 = r1
        L92:
            if (r0 != 0) goto L95
            goto La2
        L95:
            android.widget.TextView r7 = r7.c7()
            if (r7 == 0) goto L9f
            java.lang.CharSequence r1 = r7.getText()
        L9f:
            r0.setText(r1)
        La2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.hz.q(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // ie2.h
    public void s(android.os.Bundle bundle) {
        df2.lz lzVar = this.f311898d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(lzVar, null, null, new df2.gz(lzVar, null), 3, null);
    }
}
