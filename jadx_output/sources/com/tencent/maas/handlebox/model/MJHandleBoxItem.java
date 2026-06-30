package com.tencent.maas.handlebox.model;

/* loaded from: classes5.dex */
public class MJHandleBoxItem {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap f48020a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.base.Vec2 f48021b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner f48022c;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.maas.handlebox.model.MJHandleBoxItem.MJHandleBoxActionType f48023d;

    /* loaded from: classes5.dex */
    public enum MJHandleBoxActionType {
        MJHandleBoxActionTypeNone(0),
        MJHandleBoxActionTypeDelete(1),
        MJHandleBoxActionTypeFlip(2),
        MJHandleBoxActionTypeTransform(3);


        /* renamed from: d, reason: collision with root package name */
        public final int f48029d;

        MJHandleBoxActionType(int i17) {
            this.f48029d = i17;
        }

        public static com.tencent.maas.handlebox.model.MJHandleBoxItem.MJHandleBoxActionType fromInt(int i17) {
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

        public int getValue() {
            return this.f48029d;
        }
    }

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
        public final int f48041d;

        MJRectCorner(int i17) {
            this.f48041d = i17;
        }

        public static com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner fromInt(int i17) {
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

        public int getValue() {
            return this.f48041d;
        }
    }

    public MJHandleBoxItem(android.graphics.Bitmap bitmap, com.tencent.maas.base.Vec2 vec2, com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner mJRectCorner, com.tencent.maas.handlebox.model.MJHandleBoxItem.MJHandleBoxActionType mJHandleBoxActionType) {
        this.f48020a = bitmap;
        this.f48021b = vec2;
        this.f48022c = mJRectCorner;
        this.f48023d = mJHandleBoxActionType;
    }

    public int getActionType() {
        return this.f48023d.getValue();
    }

    public android.graphics.Bitmap getImage() {
        return this.f48020a;
    }

    public com.tencent.maas.base.Vec2 getImageSize() {
        return this.f48021b;
    }

    public int getRectCorner() {
        return this.f48022c.getValue();
    }

    public MJHandleBoxItem(android.graphics.Bitmap bitmap, com.tencent.maas.base.Vec2 vec2, int i17, int i18) {
        this.f48020a = bitmap;
        this.f48021b = vec2;
        this.f48022c = com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner.fromInt(i17);
        this.f48023d = com.tencent.maas.handlebox.model.MJHandleBoxItem.MJHandleBoxActionType.fromInt(i18);
    }
}
