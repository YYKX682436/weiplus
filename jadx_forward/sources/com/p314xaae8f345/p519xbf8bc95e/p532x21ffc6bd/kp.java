package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class kp {

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public android.widget.Toast f131697a;

        /* renamed from: b, reason: collision with root package name */
        private int f131698b;

        /* renamed from: c, reason: collision with root package name */
        private int f131699c;

        /* renamed from: d, reason: collision with root package name */
        private int f131700d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f131701e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f131702f;

        /* renamed from: g, reason: collision with root package name */
        private android.widget.TextView f131703g;

        /* renamed from: h, reason: collision with root package name */
        private android.widget.TextView f131704h;

        /* renamed from: i, reason: collision with root package name */
        private android.widget.TextView f131705i;

        /* renamed from: j, reason: collision with root package name */
        private android.content.Context f131706j;

        public a(android.content.Context context) {
            this.f131706j = context;
        }

        private com.tencent.mapsdk.internal.kp.a b(java.lang.String str) {
            return a(str, 8388611);
        }

        private void c() {
            android.widget.Toast toast = this.f131697a;
            if (toast != null) {
                toast.cancel();
            }
        }

        public final boolean b() {
            android.widget.Toast toast = this.f131697a;
            if (toast == null) {
                return false;
            }
            toast.show();
            return true;
        }

        public final com.tencent.mapsdk.internal.kp.a a(android.content.Context context, android.view.View view, int i17) {
            android.widget.Toast toast = new android.widget.Toast(context);
            this.f131697a = toast;
            toast.setView(view);
            this.f131697a.setDuration(i17);
            this.f131698b = this.f131697a.getGravity();
            return this;
        }

        public final android.view.ViewGroup a(android.content.Context context, java.lang.String str, java.lang.String str2) {
            this.f131701e = str;
            this.f131702f = str2;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            int a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kl.a(context, 5);
            int a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kl.a(context, 10);
            linearLayout.setPadding(a18, a17, a18, a17);
            linearLayout.setBackgroundColor(-12303292);
            linearLayout.setOrientation(1);
            if (!android.text.TextUtils.isEmpty(str)) {
                this.f131704h = new android.widget.TextView(context);
                int a19 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kl.a(context, 5);
                this.f131704h.setPadding(a19, a19, a19, a19);
                this.f131704h.setText(str);
                this.f131704h.setTextColor(-1);
                this.f131704h.setTextSize(2, 18.0f);
                linearLayout.addView(this.f131704h, new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                android.widget.TextView textView = new android.widget.TextView(context);
                this.f131705i = textView;
                textView.setId(android.R.id.message);
                this.f131705i.setText(str2);
                this.f131705i.setTextColor(-1);
                this.f131705i.setTextSize(2, 16.0f);
                int a27 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kl.a(context, 5);
                this.f131705i.setPadding(a27, a27, a27, a27);
                linearLayout.addView(this.f131705i, new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            }
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(21);
            android.widget.TextView textView2 = new android.widget.TextView(context);
            int a28 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kl.a(context, 5);
            int a29 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kl.a(context, 10);
            textView2.setTextColor(-1);
            textView2.setBackgroundColor(-16776961);
            textView2.setPadding(a29, a28, a29, a28);
            textView2.setVisibility(8);
            this.f131703g = textView2;
            linearLayout2.addView(textView2, new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            linearLayout.addView(linearLayout2, new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            return linearLayout;
        }

        public final com.tencent.mapsdk.internal.kp.a a() {
            try {
                java.lang.Object a17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(this.f131697a, "mTN");
                if (a17 != null) {
                    java.lang.Object a18 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hp.a(a17, "mParams");
                    if (a18 instanceof android.view.WindowManager.LayoutParams) {
                        ((android.view.WindowManager.LayoutParams) a18).flags = 136;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            return this;
        }

        public final com.tencent.mapsdk.internal.kp.a a(java.lang.String str, android.view.View.OnClickListener onClickListener) {
            if (this.f131703g != null && !android.text.TextUtils.isEmpty(str) && onClickListener != null) {
                this.f131703g.setText(str);
                this.f131703g.setOnClickListener(onClickListener);
                this.f131703g.setVisibility(0);
            }
            return this;
        }

        private com.tencent.mapsdk.internal.kp.a a(java.lang.String str) {
            android.widget.TextView textView;
            this.f131701e = str;
            if (str != null && (textView = this.f131704h) != null) {
                textView.setText(str);
            }
            return this;
        }

        public final com.tencent.mapsdk.internal.kp.a a(java.lang.String str, int i17) {
            android.widget.TextView textView;
            this.f131702f = str;
            if (str != null && (textView = this.f131705i) != null) {
                textView.setText(str);
                this.f131705i.setGravity(i17);
            }
            return this;
        }

        private com.tencent.mapsdk.internal.kp.a a(int i17) {
            this.f131698b = i17;
            android.widget.Toast toast = this.f131697a;
            if (toast != null) {
                toast.setGravity(i17, this.f131699c, this.f131700d);
            }
            return this;
        }

        private com.tencent.mapsdk.internal.kp.a a(int i17, int i18) {
            this.f131699c = i17;
            this.f131700d = i18;
            android.widget.Toast toast = this.f131697a;
            if (toast != null) {
                toast.setGravity(this.f131698b, i17, i18);
            }
            return this;
        }
    }

    public static com.tencent.mapsdk.internal.kp.a a(android.content.Context context, java.lang.String str, java.lang.String str2, int i17) {
        if (context == null) {
            return null;
        }
        com.tencent.mapsdk.internal.kp.a aVar = new com.tencent.mapsdk.internal.kp.a(context);
        return aVar.a(context, aVar.a(context, str, str2), i17);
    }

    private static com.tencent.mapsdk.internal.kp.a b(android.content.Context context, java.lang.String str) {
        return a(context, null, str, 0);
    }

    private static com.tencent.mapsdk.internal.kp.a a(android.content.Context context) {
        return a(context, null, " ", 0);
    }

    private static com.tencent.mapsdk.internal.kp.a a(android.content.Context context, java.lang.String str) {
        return a(context, null, str, 0);
    }
}
