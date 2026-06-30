package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class fs implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f130974f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mapsdk.internal.fs.a f130975g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap[] f130976h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f130977i;

    /* renamed from: k, reason: collision with root package name */
    private final int f130979k;

    /* renamed from: l, reason: collision with root package name */
    private android.graphics.Bitmap f130980l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f130981m;

    /* renamed from: o, reason: collision with root package name */
    private int f130983o;

    /* renamed from: p, reason: collision with root package name */
    private int f130984p;

    /* renamed from: q, reason: collision with root package name */
    private int f130985q;

    /* renamed from: r, reason: collision with root package name */
    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nc f130986r;

    /* renamed from: j, reason: collision with root package name */
    private final java.lang.String f130978j = "marker_default.png";

    /* renamed from: a, reason: collision with root package name */
    public int f130969a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f130970b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f130971c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f130972d = "";

    /* renamed from: e, reason: collision with root package name */
    public float f130973e = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    private int f130982n = 1;

    /* loaded from: classes13.dex */
    public static class a implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.tencent.mapsdk.internal.fs.a> f17383x681a0c0c = new android.os.Parcelable.Creator<com.tencent.mapsdk.internal.fs.a>() { // from class: com.tencent.mapsdk.internal.fs.a.1
            private static com.tencent.mapsdk.internal.fs.a a(android.os.Parcel parcel) {
                return new com.tencent.mapsdk.internal.fs.a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ com.tencent.mapsdk.internal.fs.a createFromParcel(android.os.Parcel parcel) {
                return new com.tencent.mapsdk.internal.fs.a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ com.tencent.mapsdk.internal.fs.a[] newArray(int i17) {
                return new com.tencent.mapsdk.internal.fs.a[i17];
            }

            private static com.tencent.mapsdk.internal.fs.a[] a(int i17) {
                return new com.tencent.mapsdk.internal.fs.a[i17];
            }
        };

        /* renamed from: a, reason: collision with root package name */
        java.lang.String f130987a;

        /* renamed from: b, reason: collision with root package name */
        int f130988b;

        /* renamed from: c, reason: collision with root package name */
        int f130989c;

        /* renamed from: d, reason: collision with root package name */
        public float f130990d;

        /* renamed from: e, reason: collision with root package name */
        public int f130991e;

        /* renamed from: f, reason: collision with root package name */
        public android.graphics.Typeface f130992f;

        /* renamed from: g, reason: collision with root package name */
        public float f130993g;

        public a(java.lang.String str, int i17, int i18) {
            this.f130993g = 1.0f;
            this.f130987a = str;
            this.f130988b = i17;
            this.f130989c = i18;
        }

        private float a() {
            return this.f130993g;
        }

        private float b() {
            return this.f130990d;
        }

        private int c() {
            return this.f130991e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        /* renamed from: toString */
        public final java.lang.String m36729x9616526c() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FontText{text='");
            stringBuffer.append(this.f130987a);
            stringBuffer.append("', textSize=");
            stringBuffer.append(this.f130988b);
            stringBuffer.append(", textColor=");
            stringBuffer.append(this.f130989c);
            stringBuffer.append(", strokeWith=");
            stringBuffer.append(this.f130990d);
            stringBuffer.append(", strokeColor=");
            stringBuffer.append(this.f130991e);
            stringBuffer.append(", typeface=");
            stringBuffer.append(this.f130992f);
            stringBuffer.append(", scale=");
            stringBuffer.append(this.f130993g);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f130987a);
            parcel.writeInt(this.f130988b);
            parcel.writeInt(this.f130989c);
            parcel.writeFloat(this.f130990d);
            parcel.writeInt(this.f130991e);
            parcel.writeFloat(this.f130993g);
        }

        private void a(float f17) {
            this.f130993g = f17;
        }

        private void b(float f17) {
            this.f130990d = f17;
        }

        private void a(int i17) {
            this.f130991e = i17;
        }

        private void a(android.graphics.Typeface typeface) {
            this.f130992f = typeface;
        }

        public a(android.os.Parcel parcel) {
            this.f130993g = 1.0f;
            this.f130987a = parcel.readString();
            this.f130988b = parcel.readInt();
            this.f130989c = parcel.readInt();
            this.f130990d = parcel.readFloat();
            this.f130991e = parcel.readInt();
            this.f130993g = parcel.readFloat();
        }
    }

    public fs(android.content.Context context, int i17) {
        this.f130977i = context;
        this.f130979k = i17;
    }

    private static java.lang.String a(float f17) {
        if (f17 < 30.0f) {
            return "RED.png";
        }
        if (f17 >= 30.0f && f17 < 60.0f) {
            return "ORANGE.png";
        }
        if (f17 >= 60.0f && f17 < 120.0f) {
            return "YELLOW.png";
        }
        if (f17 >= 120.0f && f17 < 180.0f) {
            return "GREEN.png";
        }
        if (f17 >= 180.0f && f17 < 210.0f) {
            return "CYAN.png";
        }
        if (f17 >= 210.0f && f17 < 240.0f) {
            return "AZURE.png";
        }
        if (f17 >= 240.0f && f17 < 270.0f) {
            return "BLUE.png";
        }
        if (f17 >= 270.0f && f17 < 300.0f) {
            return "VIOLET.png";
        }
        if (f17 >= 300.0f && f17 < 330.0f) {
            return "MAGENTAV.png";
        }
        if (f17 >= 330.0f) {
            return "ROSE.png";
        }
        return null;
    }

    private static java.lang.String b(android.graphics.Bitmap bitmap) {
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(bitmap);
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator c(java.lang.String str) {
        this.f130971c = str;
        return this;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator d(java.lang.String str) {
        this.f130972d = str;
        return this;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator e(java.lang.String str) {
        this.f130974f = str;
        return this;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator
    /* renamed from: activeSize */
    public final int mo36719x79d3e027() {
        android.graphics.Bitmap[] bitmapArr = this.f130976h;
        return bitmapArr != null ? bitmapArr.length : this.f130980l != null ? 1 : 0;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator
    /* renamed from: getBitmap */
    public final android.graphics.Bitmap mo36720x12501425(android.content.Context context) {
        android.graphics.Bitmap bitmap = this.f130980l;
        if (bitmap != null && this.f130981m != null && this.f130979k != 10) {
            return bitmap;
        }
        android.graphics.Bitmap bitmap2 = null;
        if (context == null) {
            return null;
        }
        com.tencent.mapsdk.internal.hl.a aVar = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b;
        android.graphics.Bitmap a17 = aVar != null ? aVar.a(mo36721xbe9ba820()) : null;
        if (a17 == null) {
            switch (this.f130979k) {
                case 1:
                    bitmap2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(context, this.f130969a);
                    break;
                case 2:
                    bitmap2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.c(context, this.f130970b);
                    if (bitmap2 == null && (bitmap2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(context, this.f130970b)) != null && !this.f130970b.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy.f131041i)) {
                        bitmap2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(bitmap2);
                        break;
                    }
                    break;
                case 3:
                    bitmap2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(context, this.f130971c);
                    break;
                case 4:
                    bitmap2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.f130972d);
                    break;
                case 5:
                    bitmap2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(context, "marker_default.png");
                    break;
                case 6:
                    java.lang.String a18 = a(this.f130973e);
                    if (a18 != null) {
                        bitmap2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(context, a18);
                        break;
                    }
                    break;
                case 7:
                    bitmap2 = this.f130980l;
                    break;
                case 8:
                    if (!android.text.TextUtils.isEmpty(this.f130974f)) {
                        bitmap2 = a(this.f130974f);
                        break;
                    }
                    break;
                case 9:
                    com.tencent.mapsdk.internal.fs.a aVar2 = this.f130975g;
                    if (aVar2 != null) {
                        if (this.f130986r == null) {
                            this.f130986r = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nc(context);
                        }
                        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nc ncVar = this.f130986r;
                        ncVar.setText(aVar2.f130987a);
                        ncVar.setTextSize(0, aVar2.f130988b * aVar2.f130993g);
                        ncVar.setTextColor(aVar2.f130989c);
                        ncVar.m36839xe1d3a649(aVar2.f130991e);
                        ncVar.m36840xe2eaa4ac(aVar2.f130990d * aVar2.f130993g);
                        ncVar.setTypeface(aVar2.f130992f);
                        bitmap2 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(ncVar);
                        break;
                    }
                    break;
                case 10:
                    android.graphics.Bitmap[] bitmapArr = this.f130976h;
                    if (bitmapArr != null) {
                        int length = bitmapArr.length;
                        int i17 = this.f130985q;
                        if (length > i17 && i17 >= 0) {
                            bitmap2 = bitmapArr[i17];
                            break;
                        }
                    }
                    break;
            }
            com.tencent.mapsdk.internal.hl.a aVar3 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b;
            if (aVar3 != null && bitmap2 != null) {
                aVar3.a(mo36721xbe9ba820(), bitmap2);
            }
            a17 = bitmap2;
        }
        if (a17 != null) {
            this.f130983o = a17.getWidth();
            this.f130984p = a17.getHeight();
            this.f130980l = a17;
        }
        return a17;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator
    /* renamed from: getBitmapId */
    public final java.lang.String mo36721xbe9ba820() {
        android.graphics.Bitmap bitmap;
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (android.text.TextUtils.isEmpty(this.f130981m) || this.f130979k == 10) {
            switch (this.f130979k) {
                case 1:
                    this.f130981m = "res_" + this.f130969a;
                    break;
                case 2:
                    this.f130981m = "asset_" + this.f130970b;
                    break;
                case 3:
                    this.f130981m = "file_" + this.f130971c;
                    break;
                case 4:
                    this.f130981m = "path_" + this.f130972d;
                    break;
                case 5:
                    this.f130981m = "asset_marker_default.png";
                    break;
                case 6:
                    java.lang.String a17 = a(this.f130973e);
                    if (a17 != null) {
                        this.f130981m = "asset_".concat(a17);
                        break;
                    }
                    break;
                case 7:
                    android.graphics.Bitmap bitmap2 = this.f130980l;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        this.f130981m = "bitmap_" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.f130980l);
                        break;
                    }
                    break;
                case 8:
                    if (!android.text.TextUtils.isEmpty(this.f130974f)) {
                        this.f130981m = "url_" + com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(this.f130974f);
                        break;
                    }
                    break;
                case 9:
                    if (this.f130975g != null) {
                        this.f130981m = "fonttext_" + com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(this.f130975g.m36729x9616526c());
                        break;
                    }
                    break;
                case 10:
                    android.graphics.Bitmap[] bitmapArr = this.f130976h;
                    if (bitmapArr != null) {
                        int length = bitmapArr.length;
                        int i17 = this.f130985q;
                        if (length > i17 && i17 >= 0 && (bitmap = bitmapArr[i17]) != null && !bitmap.isRecycled()) {
                            this.f130981m = "bitmaps_" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(bitmap);
                            break;
                        }
                    }
                    break;
            }
        }
        sb6.append(this.f130981m);
        if (this.f130982n <= 1) {
            str = "";
        } else {
            str = "@" + this.f130982n + "x";
        }
        sb6.append(str);
        return sb6.toString();
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator
    /* renamed from: getFormateType */
    public final int mo36722x310cfa72() {
        return this.f130979k;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator
    /* renamed from: getHeight */
    public final int mo36723x1c4fb41d() {
        mo36720x12501425(this.f130977i);
        return this.f130984p;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator
    /* renamed from: getWidth */
    public final int mo36724x755bd410() {
        mo36720x12501425(this.f130977i);
        return this.f130983o;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator
    /* renamed from: nextActiveIndex */
    public final int mo36725x26390479() {
        android.graphics.Bitmap[] bitmapArr = this.f130976h;
        if (bitmapArr == null || bitmapArr.length <= 1) {
            this.f130985q = 0;
        } else {
            int i17 = this.f130985q + 1;
            this.f130985q = i17;
            this.f130985q = i17 % bitmapArr.length;
        }
        return this.f130985q;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator
    /* renamed from: recycle */
    public final void mo36726x408b7293() {
        com.p314xaae8f345.p519xbf8bc95e.p520x2eaf9f.p528x6a710b1.log.C4385x77975d46.b(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kx.f131751s, "remove on format recycle");
        if (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.f131304b.b(mo36721xbe9ba820())) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f130976h);
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.kt.a(this.f130980l);
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator
    /* renamed from: setScale */
    public final void mo36727x53aeca08(int i17) {
        this.f130982n = i17;
    }

    private java.lang.String a() {
        if (this.f130982n <= 1) {
            return "";
        }
        return "@" + this.f130982n + "x";
    }

    private java.lang.String b() {
        android.graphics.Bitmap bitmap;
        if (!android.text.TextUtils.isEmpty(this.f130981m) && this.f130979k != 10) {
            return this.f130981m;
        }
        switch (this.f130979k) {
            case 1:
                this.f130981m = "res_" + this.f130969a;
                break;
            case 2:
                this.f130981m = "asset_" + this.f130970b;
                break;
            case 3:
                this.f130981m = "file_" + this.f130971c;
                break;
            case 4:
                this.f130981m = "path_" + this.f130972d;
                break;
            case 5:
                this.f130981m = "asset_marker_default.png";
                break;
            case 6:
                java.lang.String a17 = a(this.f130973e);
                if (a17 != null) {
                    this.f130981m = "asset_".concat(a17);
                    break;
                }
                break;
            case 7:
                android.graphics.Bitmap bitmap2 = this.f130980l;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    this.f130981m = "bitmap_" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.f130980l);
                    break;
                }
                break;
            case 8:
                if (!android.text.TextUtils.isEmpty(this.f130974f)) {
                    this.f130981m = "url_" + com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(this.f130974f);
                    break;
                }
                break;
            case 9:
                if (this.f130975g != null) {
                    this.f130981m = "fonttext_" + com.p314xaae8f345.map.p511x696c9db.C4314x286422.m35832x40453099(this.f130975g.m36729x9616526c());
                    break;
                }
                break;
            case 10:
                android.graphics.Bitmap[] bitmapArr = this.f130976h;
                if (bitmapArr != null) {
                    int length = bitmapArr.length;
                    int i17 = this.f130985q;
                    if (length > i17 && i17 >= 0 && (bitmap = bitmapArr[i17]) != null && !bitmap.isRecycled()) {
                        this.f130981m = "bitmaps_" + com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(bitmap);
                        break;
                    }
                }
                break;
        }
        return this.f130981m;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private android.graphics.Bitmap a(android.content.Context context, int i17) {
        switch (i17) {
            case 1:
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(context, this.f130969a);
            case 2:
                android.graphics.Bitmap c17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.c(context, this.f130970b);
                if (c17 != null) {
                    return c17;
                }
                android.graphics.Bitmap b17 = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(context, this.f130970b);
                return (b17 == null || this.f130970b.equals(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fy.f131041i)) ? b17 : com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(b17);
            case 3:
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(context, this.f130971c);
            case 4:
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(this.f130972d);
            case 5:
                return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(context, "marker_default.png");
            case 6:
                java.lang.String a17 = a(this.f130973e);
                if (a17 != null) {
                    return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.b(context, a17);
                }
                return null;
            case 7:
                return this.f130980l;
            case 8:
                if (!android.text.TextUtils.isEmpty(this.f130974f)) {
                    return a(this.f130974f);
                }
                return null;
            case 9:
                com.tencent.mapsdk.internal.fs.a aVar = this.f130975g;
                if (aVar != null) {
                    if (this.f130986r == null) {
                        this.f130986r = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nc(context);
                    }
                    com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nc ncVar = this.f130986r;
                    ncVar.setText(aVar.f130987a);
                    ncVar.setTextSize(0, aVar.f130988b * aVar.f130993g);
                    ncVar.setTextColor(aVar.f130989c);
                    ncVar.m36839xe1d3a649(aVar.f130991e);
                    ncVar.m36840xe2eaa4ac(aVar.f130990d * aVar.f130993g);
                    ncVar.setTypeface(aVar.f130992f);
                    return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(ncVar);
                }
                return null;
            case 10:
                android.graphics.Bitmap[] bitmapArr = this.f130976h;
                if (bitmapArr != null) {
                    int length = bitmapArr.length;
                    int i18 = this.f130985q;
                    if (length > i18 && i18 >= 0) {
                        return bitmapArr[i18];
                    }
                }
                return null;
            default:
                return null;
        }
    }

    private android.graphics.Bitmap a(android.content.Context context, com.tencent.mapsdk.internal.fs.a aVar) {
        if (this.f130986r == null) {
            this.f130986r = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nc(context);
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.nc ncVar = this.f130986r;
        ncVar.setText(aVar.f130987a);
        ncVar.setTextSize(0, aVar.f130988b * aVar.f130993g);
        ncVar.setTextColor(aVar.f130989c);
        ncVar.m36839xe1d3a649(aVar.f130991e);
        ncVar.m36840xe2eaa4ac(aVar.f130990d * aVar.f130993g);
        ncVar.setTypeface(aVar.f130992f);
        return com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hl.a(ncVar);
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator b(java.lang.String str) {
        this.f130970b = str;
        return this;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator b(float f17) {
        this.f130973e = f17;
        return this;
    }

    private static android.graphics.Bitmap a(java.lang.String str) {
        com.p314xaae8f345.map.p511x696c9db.net.C4330xdd3bdcde m35995x5b4bacb = com.p314xaae8f345.map.p511x696c9db.net.C4327x946a3f70.m35928x9cf0d20b().m35934xdc3ef9b().url(str).m35995x5b4bacb();
        if (m35995x5b4bacb != null && m35995x5b4bacb.mo36017xd4418ac9()) {
            try {
                byte[] bArr = m35995x5b4bacb.f16977x2eefaa;
                return android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            } catch (java.lang.OutOfMemoryError unused) {
                java.lang.System.gc();
                try {
                    byte[] bArr2 = m35995x5b4bacb.f16977x2eefaa;
                    return android.graphics.BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                } catch (java.lang.OutOfMemoryError unused2) {
                }
            }
        }
        return null;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator a(int i17) {
        this.f130969a = i17;
        return this;
    }

    public final com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator a(android.graphics.Bitmap bitmap) {
        this.f130980l = bitmap;
        mo36720x12501425(this.f130977i);
        return this;
    }

    private com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26010x4177761e.BitmapFormator a(com.tencent.mapsdk.internal.fs.a aVar) {
        this.f130975g = aVar;
        return this;
    }

    private void a(android.graphics.Bitmap[] bitmapArr) {
        this.f130976h = bitmapArr;
        mo36720x12501425(this.f130977i);
    }
}
