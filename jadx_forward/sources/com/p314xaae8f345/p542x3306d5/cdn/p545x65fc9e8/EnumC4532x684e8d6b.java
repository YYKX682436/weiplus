package com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8;

/* renamed from: com.tencent.mars.cdn.proto.UploadFrom */
/* loaded from: classes6.dex */
public enum EnumC4532x684e8d6b implements com.p314xaae8f345.mm.p2495xc50a8b8b.h {
    UPLOAD_FROM_UNSPECIFIED(0),
    UPLOAD_FROM_REAL_UPLOAD(1),
    UPLOAD_FROM_CAMERA_SHOOT(2),
    UPLOAD_FROM_PHOTO_SAVE_AS(3),
    UPLOAD_FROM_PHOTO(4),
    UPLOAD_FROM_EDIT(5),
    UPLOAD_FROM_FORWARD(6),
    UPLOAD_FROM_SCREEN_SHOT(7),
    UPLOAD_FROM_FORBID_HIT(8),
    UPLOAD_FROM_UPPER_LIMIT(9),
    UPLOAD_FROM_ONLY_HIT_WHEN_FINISH(10);


    /* renamed from: UPLOAD_FROM_CAMERA_SHOOT_VALUE */
    public static final int f19092x39f0596e = 2;

    /* renamed from: UPLOAD_FROM_EDIT_VALUE */
    public static final int f19094xd3952053 = 5;

    /* renamed from: UPLOAD_FROM_FORBID_HIT_VALUE */
    public static final int f19096xf78e7ed1 = 8;

    /* renamed from: UPLOAD_FROM_FORWARD_VALUE */
    public static final int f19098x32aad660 = 6;

    /* renamed from: UPLOAD_FROM_ONLY_HIT_WHEN_FINISH_VALUE */
    public static final int f19100xdc3230e2 = 10;

    /* renamed from: UPLOAD_FROM_PHOTO_SAVE_AS_VALUE */
    public static final int f19103x1e4fc482 = 3;

    /* renamed from: UPLOAD_FROM_PHOTO_VALUE */
    public static final int f19104x11bdae4d = 4;

    /* renamed from: UPLOAD_FROM_REAL_UPLOAD_VALUE */
    public static final int f19106x2785313d = 1;

    /* renamed from: UPLOAD_FROM_SCREEN_SHOT_VALUE */
    public static final int f19108x66a06028 = 7;

    /* renamed from: UPLOAD_FROM_UNSPECIFIED_VALUE */
    public static final int f19110x76ac7cd2 = 0;

    /* renamed from: UPLOAD_FROM_UPPER_LIMIT_VALUE */
    public static final int f19112x46504a19 = 9;

    /* renamed from: value */
    public final int f19113x6ac9171;

    EnumC4532x684e8d6b(int i17) {
        this.f19113x6ac9171 = i17;
    }

    /* renamed from: forNumber */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4532x684e8d6b m39660x382ad972(int i17) {
        switch (i17) {
            case 0:
                return UPLOAD_FROM_UNSPECIFIED;
            case 1:
                return UPLOAD_FROM_REAL_UPLOAD;
            case 2:
                return UPLOAD_FROM_CAMERA_SHOOT;
            case 3:
                return UPLOAD_FROM_PHOTO_SAVE_AS;
            case 4:
                return UPLOAD_FROM_PHOTO;
            case 5:
                return UPLOAD_FROM_EDIT;
            case 6:
                return UPLOAD_FROM_FORWARD;
            case 7:
                return UPLOAD_FROM_SCREEN_SHOT;
            case 8:
                return UPLOAD_FROM_FORBID_HIT;
            case 9:
                return UPLOAD_FROM_UPPER_LIMIT;
            case 10:
                return UPLOAD_FROM_ONLY_HIT_WHEN_FINISH;
            default:
                return null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.h
    /* renamed from: getNumber */
    public final int mo11476x276ffe3f() {
        return this.f19113x6ac9171;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p542x3306d5.cdn.p545x65fc9e8.EnumC4532x684e8d6b m39661xdce0328(int i17) {
        return m39660x382ad972(i17);
    }
}
