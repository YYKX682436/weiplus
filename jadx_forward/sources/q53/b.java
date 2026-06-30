package q53;

/* loaded from: classes8.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q53.f f441715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f441716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f441717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f441718g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f441719h;

    public b(q53.f fVar, int i17, int i18, int i19, boolean z17) {
        this.f441715d = fVar;
        this.f441716e = i17;
        this.f441717f = i18;
        this.f441718g = i19;
        this.f441719h = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ImageView imageView;
        int i17 = q53.f.D1;
        q53.f fVar = this.f441715d;
        fVar.getClass();
        int i18 = this.f441716e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        int i19 = this.f441717f;
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i19);
        int i27 = this.f441718g;
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(i27);
        boolean z17 = this.f441719h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameWebSettingActionBar", "get chat unread count: %d,  notifyUnreadCount:%d,gameLifeUnreadCount:%d, hasChatRoomUnreadMsg:%b", valueOf, valueOf2, valueOf3, java.lang.Boolean.valueOf(z17));
        int i28 = i18 + i27;
        boolean z18 = i28 + i19 > 0 || z17;
        if (z18) {
            android.widget.TextView textView = fVar.f441730x0;
            if (textView != null) {
                textView.setVisibility(0);
            }
            android.widget.ImageView imageView2 = fVar.f441728p0;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (i28 > 0) {
                android.widget.ImageView imageView3 = fVar.f441728p0;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                android.widget.TextView textView2 = fVar.f441730x0;
                if (textView2 != null) {
                    if (i28 >= 100) {
                        textView2.setText("99+");
                        textView2.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(fVar.getContext(), i28));
                        textView2.setTextSize(0, i65.a.f(fVar.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561170bc) * i65.a.m(fVar.getContext()));
                        textView2.setVisibility(0);
                    } else {
                        textView2.setText(java.lang.String.valueOf(i28));
                        textView2.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(fVar.getContext(), i28));
                        textView2.setTextSize(0, i65.a.f(fVar.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561170bc) * i65.a.m(fVar.getContext()));
                        textView2.setVisibility(0);
                    }
                }
            } else {
                android.widget.TextView textView3 = fVar.f441730x0;
                if (textView3 != null) {
                    textView3.setVisibility(8);
                }
                if ((z18 || i19 > 0) && (imageView = fVar.f441728p0) != null) {
                    imageView.setVisibility(0);
                }
            }
        } else {
            android.widget.TextView textView4 = fVar.f441730x0;
            if (textView4 != null) {
                textView4.setVisibility(8);
            }
            android.widget.ImageView imageView4 = fVar.f441728p0;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
        }
        if (fVar.A1) {
            return;
        }
        fVar.f441731x1 = z18;
        fVar.f441733y1 = i18 + i19 + i27;
        fVar.A1 = true;
        if (!fVar.f441734z1 || fVar.f441727l1) {
            return;
        }
        fVar.f441727l1 = true;
        fVar.o(false, fVar.B1);
    }
}
