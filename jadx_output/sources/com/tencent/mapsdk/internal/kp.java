package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class kp {

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public android.widget.Toast f50164a;

        /* renamed from: b, reason: collision with root package name */
        private int f50165b;

        /* renamed from: c, reason: collision with root package name */
        private int f50166c;

        /* renamed from: d, reason: collision with root package name */
        private int f50167d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f50168e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f50169f;

        /* renamed from: g, reason: collision with root package name */
        private android.widget.TextView f50170g;

        /* renamed from: h, reason: collision with root package name */
        private android.widget.TextView f50171h;

        /* renamed from: i, reason: collision with root package name */
        private android.widget.TextView f50172i;

        /* renamed from: j, reason: collision with root package name */
        private android.content.Context f50173j;

        public a(android.content.Context context) {
            this.f50173j = context;
        }

        private com.tencent.mapsdk.internal.kp.a b(java.lang.String str) {
            return a(str, 8388611);
        }

        private void c() {
            android.widget.Toast toast = this.f50164a;
            if (toast != null) {
                toast.cancel();
            }
        }

        public final boolean b() {
            android.widget.Toast toast = this.f50164a;
            if (toast == null) {
                return false;
            }
            toast.show();
            return true;
        }

        public final com.tencent.mapsdk.internal.kp.a a(android.content.Context context, android.view.View view, int i17) {
            android.widget.Toast toast = new android.widget.Toast(context);
            this.f50164a = toast;
            toast.setView(view);
            this.f50164a.setDuration(i17);
            this.f50165b = this.f50164a.getGravity();
            return this;
        }

        public final android.view.ViewGroup a(android.content.Context context, java.lang.String str, java.lang.String str2) {
            this.f50168e = str;
            this.f50169f = str2;
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            int a17 = com.tencent.mapsdk.internal.kl.a(context, 5);
            int a18 = com.tencent.mapsdk.internal.kl.a(context, 10);
            linearLayout.setPadding(a18, a17, a18, a17);
            linearLayout.setBackgroundColor(-12303292);
            linearLayout.setOrientation(1);
            if (!android.text.TextUtils.isEmpty(str)) {
                this.f50171h = new android.widget.TextView(context);
                int a19 = com.tencent.mapsdk.internal.kl.a(context, 5);
                this.f50171h.setPadding(a19, a19, a19, a19);
                this.f50171h.setText(str);
                this.f50171h.setTextColor(-1);
                this.f50171h.setTextSize(2, 18.0f);
                linearLayout.addView(this.f50171h, new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                android.widget.TextView textView = new android.widget.TextView(context);
                this.f50172i = textView;
                textView.setId(android.R.id.message);
                this.f50172i.setText(str2);
                this.f50172i.setTextColor(-1);
                this.f50172i.setTextSize(2, 16.0f);
                int a27 = com.tencent.mapsdk.internal.kl.a(context, 5);
                this.f50172i.setPadding(a27, a27, a27, a27);
                linearLayout.addView(this.f50172i, new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            }
            android.widget.LinearLayout linearLayout2 = new android.widget.LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(21);
            android.widget.TextView textView2 = new android.widget.TextView(context);
            int a28 = com.tencent.mapsdk.internal.kl.a(context, 5);
            int a29 = com.tencent.mapsdk.internal.kl.a(context, 10);
            textView2.setTextColor(-1);
            textView2.setBackgroundColor(-16776961);
            textView2.setPadding(a29, a28, a29, a28);
            textView2.setVisibility(8);
            this.f50170g = textView2;
            linearLayout2.addView(textView2, new android.view.ViewGroup.MarginLayoutParams(-2, -2));
            linearLayout.addView(linearLayout2, new android.view.ViewGroup.MarginLayoutParams(-1, -2));
            return linearLayout;
        }

        public final com.tencent.mapsdk.internal.kp.a a() {
            try {
                java.lang.Object a17 = com.tencent.mapsdk.internal.hp.a(this.f50164a, "mTN");
                if (a17 != null) {
                    java.lang.Object a18 = com.tencent.mapsdk.internal.hp.a(a17, "mParams");
                    if (a18 instanceof android.view.WindowManager.LayoutParams) {
                        ((android.view.WindowManager.LayoutParams) a18).flags = 136;
                    }
                }
            } catch (java.lang.Exception unused) {
            }
            return this;
        }

        public final com.tencent.mapsdk.internal.kp.a a(java.lang.String str, android.view.View.OnClickListener onClickListener) {
            if (this.f50170g != null && !android.text.TextUtils.isEmpty(str) && onClickListener != null) {
                this.f50170g.setText(str);
                this.f50170g.setOnClickListener(onClickListener);
                this.f50170g.setVisibility(0);
            }
            return this;
        }

        private com.tencent.mapsdk.internal.kp.a a(java.lang.String str) {
            android.widget.TextView textView;
            this.f50168e = str;
            if (str != null && (textView = this.f50171h) != null) {
                textView.setText(str);
            }
            return this;
        }

        public final com.tencent.mapsdk.internal.kp.a a(java.lang.String str, int i17) {
            android.widget.TextView textView;
            this.f50169f = str;
            if (str != null && (textView = this.f50172i) != null) {
                textView.setText(str);
                this.f50172i.setGravity(i17);
            }
            return this;
        }

        private com.tencent.mapsdk.internal.kp.a a(int i17) {
            this.f50165b = i17;
            android.widget.Toast toast = this.f50164a;
            if (toast != null) {
                toast.setGravity(i17, this.f50166c, this.f50167d);
            }
            return this;
        }

        private com.tencent.mapsdk.internal.kp.a a(int i17, int i18) {
            this.f50166c = i17;
            this.f50167d = i18;
            android.widget.Toast toast = this.f50164a;
            if (toast != null) {
                toast.setGravity(this.f50165b, i17, i18);
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
