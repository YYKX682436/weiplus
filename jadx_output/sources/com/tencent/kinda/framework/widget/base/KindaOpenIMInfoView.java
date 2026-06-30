package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class KindaOpenIMInfoView extends com.tencent.kinda.framework.widget.base.MMKView<android.widget.TextView> implements com.tencent.kinda.gen.KOpenIMInfoView {
    private java.lang.String formatText = "";
    private java.lang.String nickName = "";
    private java.lang.String trueName = "";
    private java.lang.String businessName = "";
    private com.tencent.kinda.gen.TextAlign textAlign = com.tencent.kinda.gen.TextAlign.LEFT;
    private com.tencent.kinda.gen.DynamicColor textColor = new com.tencent.kinda.gen.DynamicColor(-1, 0);

    /* renamed from: com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView$2, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$TextAlign;

        static {
            int[] iArr = new int[com.tencent.kinda.gen.TextAlign.values().length];
            $SwitchMap$com$tencent$kinda$gen$TextAlign = iArr;
            try {
                iArr[com.tencent.kinda.gen.TextAlign.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$TextAlign[com.tencent.kinda.gen.TextAlign.CENTER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$TextAlign[com.tencent.kinda.gen.TextAlign.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public java.lang.String getBusinessNameText() {
        return this.businessName;
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public java.lang.String getFormatText() {
        return this.formatText;
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public java.lang.String getNickNameText() {
        return this.nickName;
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public com.tencent.kinda.gen.TextAlign getTextAlign() {
        return this.textAlign;
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public com.tencent.kinda.gen.DynamicColor getTextColor() {
        return this.textColor;
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public float getTextSize() {
        return i65.a.c(com.tencent.mm.sdk.platformtools.x2.f193071a, (int) getView().getTextSize());
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public java.lang.String getTrueNameText() {
        return this.trueName;
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public void setBusinessNameText(java.lang.String str) {
        this.businessName = str;
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public void setFormatText(java.lang.String str) {
        this.formatText = str;
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public void setNickNameText(java.lang.String str) {
        this.nickName = str;
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public void setTextAlign(com.tencent.kinda.gen.TextAlign textAlign) {
        if (textAlign != null) {
            this.textAlign = textAlign;
            int gravity = getView().getGravity();
            int i17 = com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.AnonymousClass2.$SwitchMap$com$tencent$kinda$gen$TextAlign[this.textAlign.ordinal()];
            if (i17 == 1) {
                getView().setGravity(gravity | 3);
            } else if (i17 == 2) {
                getView().setGravity(17);
            } else if (i17 == 3) {
                getView().setGravity(5);
            }
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.textColor = dynamicColor;
        com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType mMViewType = com.tencent.kinda.framework.widget.tools.ColorUtil.MMViewType.MMKLabelViewText;
        java.lang.Integer.toHexString(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor, mMViewType)));
        getView().setTextColor(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor, mMViewType)));
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public void setTextSize(float f17) {
        if (f17 > 0.0f) {
            getView().setTextSize(1, f17 * (getSupportDynamicSize() ? com.tencent.kinda.framework.widget.tools.MMKViewUtil.getScaleSize(com.tencent.mm.sdk.platformtools.x2.f193071a) : 1.0f));
            notifyChanged();
        }
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public void setTrueNameText(java.lang.String str) {
        this.trueName = str;
        notifyChanged();
    }

    @Override // com.tencent.kinda.gen.KOpenIMInfoView
    public void updateContent() {
        final android.widget.TextView view = getView();
        view.setText(java.lang.String.format(this.formatText, this.nickName + this.trueName + this.businessName));
        view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.1
            /* JADX WARN: Code restructure failed: missing block: B:6:0x0092, code lost:
            
                if (r10 < r12) goto L8;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 309
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.kinda.framework.widget.base.KindaOpenIMInfoView.AnonymousClass1.run():void");
            }
        });
    }

    @Override // com.tencent.kinda.framework.widget.base.MMKView
    public android.widget.TextView createView(android.content.Context context) {
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0());
        textView.setGravity(19);
        textView.setLines(2);
        if (com.tencent.kinda.framework.widget.tools.ColorUtil.ifCompatKindaDarkModeDefaultColor()) {
            textView.setTextColor(context.getResources().getColor(com.tencent.mm.R.color.a0c));
            this.textColor = new com.tencent.kinda.gen.DynamicColor(java.lang.Long.parseLong("E6000000", 16), java.lang.Long.parseLong("CCFFFFFF", 16));
        }
        return textView;
    }
}
