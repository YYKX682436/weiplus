package com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29;

/* renamed from: com.tencent.maas.handlebox.model.MJHandleBoxItem */
/* loaded from: classes5.dex */
public class C4051xa7726999 {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f129553a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e f129554b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner f129555c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJHandleBoxActionType f129556d;

    /* renamed from: com.tencent.maas.handlebox.model.MJHandleBoxItem$MJHandleBoxActionType */
    /* loaded from: classes5.dex */
    public enum MJHandleBoxActionType {
        MJHandleBoxActionTypeNone(0),
        MJHandleBoxActionTypeDelete(1),
        MJHandleBoxActionTypeFlip(2),
        MJHandleBoxActionTypeTransform(3);


        /* renamed from: d, reason: collision with root package name */
        public final int f129562d;

        MJHandleBoxActionType(int i17) {
            this.f129562d = i17;
        }

        /* renamed from: fromInt */
        public static com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJHandleBoxActionType m32986xdc92efe5(int i17) {
            if (i17 == 0) {
                return MJHandleBoxActionTypeNone;
            }
            if (i17 == 1) {
                return MJHandleBoxActionTypeDelete;
            }
            if (i17 == 2) {
                return MJHandleBoxActionTypeFlip;
            }
            if (i17 == 3) {
                return MJHandleBoxActionTypeTransform;
            }
            throw new java.lang.IllegalArgumentException("Unknown enum value: " + i17);
        }

        /* renamed from: getValue */
        public int m32989x754a37bb() {
            return this.f129562d;
        }
    }

    /* renamed from: com.tencent.maas.handlebox.model.MJHandleBoxItem$MJRectCorner */
    /* loaded from: classes5.dex */
    public enum MJRectCorner {
        MJRectCornerInvalid(-1),
        MJRectCornerTopLeft(0),
        MJRectCornerBottomLeft(1),
        MJRectCornerTopRight(2),
        MJRectCornerBottomRight(3),
        MJRectCornerTopMidpoint(4),
        MJRectCornerLeftMidpoint(5),
        MJRectCornerBottomMidpoint(6),
        MJRectCornerRightMidpoint(7),
        MJRectCornerAllCorners(8);


        /* renamed from: d, reason: collision with root package name */
        public final int f129574d;

        MJRectCorner(int i17) {
            this.f129574d = i17;
        }

        /* renamed from: fromInt */
        public static com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner m32991xdc92efe5(int i17) {
            switch (i17) {
                case 0:
                    return MJRectCornerTopLeft;
                case 1:
                    return MJRectCornerBottomLeft;
                case 2:
                    return MJRectCornerTopRight;
                case 3:
                    return MJRectCornerBottomRight;
                case 4:
                    return MJRectCornerTopMidpoint;
                case 5:
                    return MJRectCornerLeftMidpoint;
                case 6:
                    return MJRectCornerBottomMidpoint;
                case 7:
                    return MJRectCornerRightMidpoint;
                case 8:
                    return MJRectCornerAllCorners;
                default:
                    return MJRectCornerInvalid;
            }
        }

        /* renamed from: getValue */
        public int m32994x754a37bb() {
            return this.f129574d;
        }
    }

    public C4051xa7726999(android.graphics.Bitmap bitmap, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner mJRectCorner, com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJHandleBoxActionType mJHandleBoxActionType) {
        this.f129553a = bitmap;
        this.f129554b = c3974x289f3e;
        this.f129555c = mJRectCorner;
        this.f129556d = mJHandleBoxActionType;
    }

    /* renamed from: getActionType */
    public int m32981x5ca22e86() {
        return this.f129556d.m32989x754a37bb();
    }

    /* renamed from: getImage */
    public android.graphics.Bitmap m32982x74984fa5() {
        return this.f129553a;
    }

    /* renamed from: getImageSize */
    public com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e m32983xcb154946() {
        return this.f129554b;
    }

    /* renamed from: getRectCorner */
    public int m32984xd302754f() {
        return this.f129555c.m32994x754a37bb();
    }

    public C4051xa7726999(android.graphics.Bitmap bitmap, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3974x289f3e c3974x289f3e, int i17, int i18) {
        this.f129553a = bitmap;
        this.f129554b = c3974x289f3e;
        this.f129555c = com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJRectCorner.m32991xdc92efe5(i17);
        this.f129556d = com.p314xaae8f345.p457x3304c6.p466x3d27ea3.p467x633fb29.C4051xa7726999.MJHandleBoxActionType.m32986xdc92efe5(i18);
    }
}
