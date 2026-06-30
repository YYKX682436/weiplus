package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class fs implements com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f49441f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mapsdk.internal.fs.a f49442g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.Bitmap[] f49443h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f49444i;

    /* renamed from: k, reason: collision with root package name */
    private final int f49446k;

    /* renamed from: l, reason: collision with root package name */
    private android.graphics.Bitmap f49447l;

    /* renamed from: m, reason: collision with root package name */
    private java.lang.String f49448m;

    /* renamed from: o, reason: collision with root package name */
    private int f49450o;

    /* renamed from: p, reason: collision with root package name */
    private int f49451p;

    /* renamed from: q, reason: collision with root package name */
    private int f49452q;

    /* renamed from: r, reason: collision with root package name */
    private com.tencent.mapsdk.internal.nc f49453r;

    /* renamed from: j, reason: collision with root package name */
    private final java.lang.String f49445j = "marker_default.png";

    /* renamed from: a, reason: collision with root package name */
    public int f49436a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f49437b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f49438c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f49439d = "";

    /* renamed from: e, reason: collision with root package name */
    public float f49440e = -1.0f;

    /* renamed from: n, reason: collision with root package name */
    private int f49449n = 1;

    /* loaded from: classes13.dex */
    public static class a implements android.os.Parcelable {
        public static final android.os.Parcelable.Creator<com.tencent.mapsdk.internal.fs.a> CREATOR = new android.os.Parcelable.Creator<com.tencent.mapsdk.internal.fs.a>() { // from class: com.tencent.mapsdk.internal.fs.a.1
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
        java.lang.String f49454a;

        /* renamed from: b, reason: collision with root package name */
        int f49455b;

        /* renamed from: c, reason: collision with root package name */
        int f49456c;

        /* renamed from: d, reason: collision with root package name */
        public float f49457d;

        /* renamed from: e, reason: collision with root package name */
        public int f49458e;

        /* renamed from: f, reason: collision with root package name */
        public android.graphics.Typeface f49459f;

        /* renamed from: g, reason: collision with root package name */
        public float f49460g;

        public a(java.lang.String str, int i17, int i18) {
            this.f49460g = 1.0f;
            this.f49454a = str;
            this.f49455b = i17;
            this.f49456c = i18;
        }

        private float a() {
            return this.f49460g;
        }

        private float b() {
            return this.f49457d;
        }

        private int c() {
            return this.f49458e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final java.lang.String toString() {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("FontText{text='");
            stringBuffer.append(this.f49454a);
            stringBuffer.append("', textSize=");
            stringBuffer.append(this.f49455b);
            stringBuffer.append(", textColor=");
            stringBuffer.append(this.f49456c);
            stringBuffer.append(", strokeWith=");
            stringBuffer.append(this.f49457d);
            stringBuffer.append(", strokeColor=");
            stringBuffer.append(this.f49458e);
            stringBuffer.append(", typeface=");
            stringBuffer.append(this.f49459f);
            stringBuffer.append(", scale=");
            stringBuffer.append(this.f49460g);
            stringBuffer.append('}');
            return stringBuffer.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f49454a);
            parcel.writeInt(this.f49455b);
            parcel.writeInt(this.f49456c);
            parcel.writeFloat(this.f49457d);
            parcel.writeInt(this.f49458e);
            parcel.writeFloat(this.f49460g);
        }

        private void a(float f17) {
            this.f49460g = f17;
        }

        private void b(float f17) {
            this.f49457d = f17;
        }

        private void a(int i17) {
            this.f49458e = i17;
        }

        private void a(android.graphics.Typeface typeface) {
            this.f49459f = typeface;
        }

        public a(android.os.Parcel parcel) {
            this.f49460g = 1.0f;
            this.f49454a = parcel.readString();
            this.f49455b = parcel.readInt();
            this.f49456c = parcel.readInt();
            this.f49457d = parcel.readFloat();
            this.f49458e = parcel.readInt();
            this.f49460g = parcel.readFloat();
        }
    }

    public fs(android.content.Context context, int i17) {
        this.f49444i = context;
        this.f49446k = i17;
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
        return com.tencent.mapsdk.internal.hl.a(bitmap);
    }

    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator c(java.lang.String str) {
        this.f49438c = str;
        return this;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator d(java.lang.String str) {
        this.f49439d = str;
        return this;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator e(java.lang.String str) {
        this.f49441f = str;
        return this;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int activeSize() {
        android.graphics.Bitmap[] bitmapArr = this.f49443h;
        return bitmapArr != null ? bitmapArr.length : this.f49447l != null ? 1 : 0;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final android.graphics.Bitmap getBitmap(android.content.Context context) {
        android.graphics.Bitmap bitmap = this.f49447l;
        if (bitmap != null && this.f49448m != null && this.f49446k != 10) {
            return bitmap;
        }
        android.graphics.Bitmap bitmap2 = null;
        if (context == null) {
            return null;
        }
        com.tencent.mapsdk.internal.hl.a aVar = com.tencent.mapsdk.internal.hl.f49771b;
        android.graphics.Bitmap a17 = aVar != null ? aVar.a(getBitmapId()) : null;
        if (a17 == null) {
            switch (this.f49446k) {
                case 1:
                    bitmap2 = com.tencent.mapsdk.internal.hl.a(context, this.f49436a);
                    break;
                case 2:
                    bitmap2 = com.tencent.mapsdk.internal.hl.c(context, this.f49437b);
                    if (bitmap2 == null && (bitmap2 = com.tencent.mapsdk.internal.hl.b(context, this.f49437b)) != null && !this.f49437b.equals(com.tencent.mapsdk.internal.fy.f49508i)) {
                        bitmap2 = com.tencent.mapsdk.internal.hl.b(bitmap2);
                        break;
                    }
                    break;
                case 3:
                    bitmap2 = com.tencent.mapsdk.internal.hl.a(context, this.f49438c);
                    break;
                case 4:
                    bitmap2 = com.tencent.mapsdk.internal.hl.a(this.f49439d);
                    break;
                case 5:
                    bitmap2 = com.tencent.mapsdk.internal.hl.b(context, "marker_default.png");
                    break;
                case 6:
                    java.lang.String a18 = a(this.f49440e);
                    if (a18 != null) {
                        bitmap2 = com.tencent.mapsdk.internal.hl.b(context, a18);
                        break;
                    }
                    break;
                case 7:
                    bitmap2 = this.f49447l;
                    break;
                case 8:
                    if (!android.text.TextUtils.isEmpty(this.f49441f)) {
                        bitmap2 = a(this.f49441f);
                        break;
                    }
                    break;
                case 9:
                    com.tencent.mapsdk.internal.fs.a aVar2 = this.f49442g;
                    if (aVar2 != null) {
                        if (this.f49453r == null) {
                            this.f49453r = new com.tencent.mapsdk.internal.nc(context);
                        }
                        com.tencent.mapsdk.internal.nc ncVar = this.f49453r;
                        ncVar.setText(aVar2.f49454a);
                        ncVar.setTextSize(0, aVar2.f49455b * aVar2.f49460g);
                        ncVar.setTextColor(aVar2.f49456c);
                        ncVar.setStrokeColor(aVar2.f49458e);
                        ncVar.setStrokeWidth(aVar2.f49457d * aVar2.f49460g);
                        ncVar.setTypeface(aVar2.f49459f);
                        bitmap2 = com.tencent.mapsdk.internal.hl.a(ncVar);
                        break;
                    }
                    break;
                case 10:
                    android.graphics.Bitmap[] bitmapArr = this.f49443h;
                    if (bitmapArr != null) {
                        int length = bitmapArr.length;
                        int i17 = this.f49452q;
                        if (length > i17 && i17 >= 0) {
                            bitmap2 = bitmapArr[i17];
                            break;
                        }
                    }
                    break;
            }
            com.tencent.mapsdk.internal.hl.a aVar3 = com.tencent.mapsdk.internal.hl.f49771b;
            if (aVar3 != null && bitmap2 != null) {
                aVar3.a(getBitmapId(), bitmap2);
            }
            a17 = bitmap2;
        }
        if (a17 != null) {
            this.f49450o = a17.getWidth();
            this.f49451p = a17.getHeight();
            this.f49447l = a17;
        }
        return a17;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final java.lang.String getBitmapId() {
        android.graphics.Bitmap bitmap;
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (android.text.TextUtils.isEmpty(this.f49448m) || this.f49446k == 10) {
            switch (this.f49446k) {
                case 1:
                    this.f49448m = "res_" + this.f49436a;
                    break;
                case 2:
                    this.f49448m = "asset_" + this.f49437b;
                    break;
                case 3:
                    this.f49448m = "file_" + this.f49438c;
                    break;
                case 4:
                    this.f49448m = "path_" + this.f49439d;
                    break;
                case 5:
                    this.f49448m = "asset_marker_default.png";
                    break;
                case 6:
                    java.lang.String a17 = a(this.f49440e);
                    if (a17 != null) {
                        this.f49448m = "asset_".concat(a17);
                        break;
                    }
                    break;
                case 7:
                    android.graphics.Bitmap bitmap2 = this.f49447l;
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        this.f49448m = "bitmap_" + com.tencent.mapsdk.internal.hl.a(this.f49447l);
                        break;
                    }
                    break;
                case 8:
                    if (!android.text.TextUtils.isEmpty(this.f49441f)) {
                        this.f49448m = "url_" + com.tencent.map.tools.Util.getMD5String(this.f49441f);
                        break;
                    }
                    break;
                case 9:
                    if (this.f49442g != null) {
                        this.f49448m = "fonttext_" + com.tencent.map.tools.Util.getMD5String(this.f49442g.toString());
                        break;
                    }
                    break;
                case 10:
                    android.graphics.Bitmap[] bitmapArr = this.f49443h;
                    if (bitmapArr != null) {
                        int length = bitmapArr.length;
                        int i17 = this.f49452q;
                        if (length > i17 && i17 >= 0 && (bitmap = bitmapArr[i17]) != null && !bitmap.isRecycled()) {
                            this.f49448m = "bitmaps_" + com.tencent.mapsdk.internal.hl.a(bitmap);
                            break;
                        }
                    }
                    break;
            }
        }
        sb6.append(this.f49448m);
        if (this.f49449n <= 1) {
            str = "";
        } else {
            str = "@" + this.f49449n + "x";
        }
        sb6.append(str);
        return sb6.toString();
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int getFormateType() {
        return this.f49446k;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int getHeight() {
        getBitmap(this.f49444i);
        return this.f49451p;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int getWidth() {
        getBitmap(this.f49444i);
        return this.f49450o;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final int nextActiveIndex() {
        android.graphics.Bitmap[] bitmapArr = this.f49443h;
        if (bitmapArr == null || bitmapArr.length <= 1) {
            this.f49452q = 0;
        } else {
            int i17 = this.f49452q + 1;
            this.f49452q = i17;
            this.f49452q = i17 % bitmapArr.length;
        }
        return this.f49452q;
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final void recycle() {
        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50218s, "remove on format recycle");
        if (com.tencent.mapsdk.internal.hl.f49771b.b(getBitmapId())) {
            com.tencent.mapsdk.internal.kt.a(this.f49443h);
            com.tencent.mapsdk.internal.kt.a(this.f49447l);
        }
    }

    @Override // com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator
    public final void setScale(int i17) {
        this.f49449n = i17;
    }

    private java.lang.String a() {
        if (this.f49449n <= 1) {
            return "";
        }
        return "@" + this.f49449n + "x";
    }

    private java.lang.String b() {
        android.graphics.Bitmap bitmap;
        if (!android.text.TextUtils.isEmpty(this.f49448m) && this.f49446k != 10) {
            return this.f49448m;
        }
        switch (this.f49446k) {
            case 1:
                this.f49448m = "res_" + this.f49436a;
                break;
            case 2:
                this.f49448m = "asset_" + this.f49437b;
                break;
            case 3:
                this.f49448m = "file_" + this.f49438c;
                break;
            case 4:
                this.f49448m = "path_" + this.f49439d;
                break;
            case 5:
                this.f49448m = "asset_marker_default.png";
                break;
            case 6:
                java.lang.String a17 = a(this.f49440e);
                if (a17 != null) {
                    this.f49448m = "asset_".concat(a17);
                    break;
                }
                break;
            case 7:
                android.graphics.Bitmap bitmap2 = this.f49447l;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    this.f49448m = "bitmap_" + com.tencent.mapsdk.internal.hl.a(this.f49447l);
                    break;
                }
                break;
            case 8:
                if (!android.text.TextUtils.isEmpty(this.f49441f)) {
                    this.f49448m = "url_" + com.tencent.map.tools.Util.getMD5String(this.f49441f);
                    break;
                }
                break;
            case 9:
                if (this.f49442g != null) {
                    this.f49448m = "fonttext_" + com.tencent.map.tools.Util.getMD5String(this.f49442g.toString());
                    break;
                }
                break;
            case 10:
                android.graphics.Bitmap[] bitmapArr = this.f49443h;
                if (bitmapArr != null) {
                    int length = bitmapArr.length;
                    int i17 = this.f49452q;
                    if (length > i17 && i17 >= 0 && (bitmap = bitmapArr[i17]) != null && !bitmap.isRecycled()) {
                        this.f49448m = "bitmaps_" + com.tencent.mapsdk.internal.hl.a(bitmap);
                        break;
                    }
                }
                break;
        }
        return this.f49448m;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private android.graphics.Bitmap a(android.content.Context context, int i17) {
        switch (i17) {
            case 1:
                return com.tencent.mapsdk.internal.hl.a(context, this.f49436a);
            case 2:
                android.graphics.Bitmap c17 = com.tencent.mapsdk.internal.hl.c(context, this.f49437b);
                if (c17 != null) {
                    return c17;
                }
                android.graphics.Bitmap b17 = com.tencent.mapsdk.internal.hl.b(context, this.f49437b);
                return (b17 == null || this.f49437b.equals(com.tencent.mapsdk.internal.fy.f49508i)) ? b17 : com.tencent.mapsdk.internal.hl.b(b17);
            case 3:
                return com.tencent.mapsdk.internal.hl.a(context, this.f49438c);
            case 4:
                return com.tencent.mapsdk.internal.hl.a(this.f49439d);
            case 5:
                return com.tencent.mapsdk.internal.hl.b(context, "marker_default.png");
            case 6:
                java.lang.String a17 = a(this.f49440e);
                if (a17 != null) {
                    return com.tencent.mapsdk.internal.hl.b(context, a17);
                }
                return null;
            case 7:
                return this.f49447l;
            case 8:
                if (!android.text.TextUtils.isEmpty(this.f49441f)) {
                    return a(this.f49441f);
                }
                return null;
            case 9:
                com.tencent.mapsdk.internal.fs.a aVar = this.f49442g;
                if (aVar != null) {
                    if (this.f49453r == null) {
                        this.f49453r = new com.tencent.mapsdk.internal.nc(context);
                    }
                    com.tencent.mapsdk.internal.nc ncVar = this.f49453r;
                    ncVar.setText(aVar.f49454a);
                    ncVar.setTextSize(0, aVar.f49455b * aVar.f49460g);
                    ncVar.setTextColor(aVar.f49456c);
                    ncVar.setStrokeColor(aVar.f49458e);
                    ncVar.setStrokeWidth(aVar.f49457d * aVar.f49460g);
                    ncVar.setTypeface(aVar.f49459f);
                    return com.tencent.mapsdk.internal.hl.a(ncVar);
                }
                return null;
            case 10:
                android.graphics.Bitmap[] bitmapArr = this.f49443h;
                if (bitmapArr != null) {
                    int length = bitmapArr.length;
                    int i18 = this.f49452q;
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
        if (this.f49453r == null) {
            this.f49453r = new com.tencent.mapsdk.internal.nc(context);
        }
        com.tencent.mapsdk.internal.nc ncVar = this.f49453r;
        ncVar.setText(aVar.f49454a);
        ncVar.setTextSize(0, aVar.f49455b * aVar.f49460g);
        ncVar.setTextColor(aVar.f49456c);
        ncVar.setStrokeColor(aVar.f49458e);
        ncVar.setStrokeWidth(aVar.f49457d * aVar.f49460g);
        ncVar.setTypeface(aVar.f49459f);
        return com.tencent.mapsdk.internal.hl.a(ncVar);
    }

    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator b(java.lang.String str) {
        this.f49437b = str;
        return this;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator b(float f17) {
        this.f49440e = f17;
        return this;
    }

    private static android.graphics.Bitmap a(java.lang.String str) {
        com.tencent.map.tools.net.NetResponse doGet = com.tencent.map.tools.net.NetManager.getInstance().builder().url(str).doGet();
        if (doGet != null && doGet.available()) {
            try {
                byte[] bArr = doGet.data;
                return android.graphics.BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            } catch (java.lang.OutOfMemoryError unused) {
                java.lang.System.gc();
                try {
                    byte[] bArr2 = doGet.data;
                    return android.graphics.BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length);
                } catch (java.lang.OutOfMemoryError unused2) {
                }
            }
        }
        return null;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator a(int i17) {
        this.f49436a = i17;
        return this;
    }

    public final com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator a(android.graphics.Bitmap bitmap) {
        this.f49447l = bitmap;
        getBitmap(this.f49444i);
        return this;
    }

    private com.tencent.tencentmap.mapsdk.maps.model.BitmapDescriptor.BitmapFormator a(com.tencent.mapsdk.internal.fs.a aVar) {
        this.f49442g = aVar;
        return this;
    }

    private void a(android.graphics.Bitmap[] bitmapArr) {
        this.f49443h = bitmapArr;
        getBitmap(this.f49444i);
    }
}
