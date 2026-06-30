package com.tencent.ilink.auth;

/* loaded from: classes4.dex */
public class FaceVideo extends com.tencent.mm.protobuf.f {
    private static final com.tencent.ilink.auth.FaceVideo DEFAULT_INSTANCE = new com.tencent.ilink.auth.FaceVideo();
    private com.tencent.ilink.auth.LiveActionType action;
    private java.util.LinkedList<com.tencent.ilink.auth.FaceFrame> frames = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[3];

    public static com.tencent.ilink.auth.FaceVideo create() {
        return new com.tencent.ilink.auth.FaceVideo();
    }

    public static com.tencent.ilink.auth.FaceVideo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.ilink.auth.FaceVideo newBuilder() {
        return new com.tencent.ilink.auth.FaceVideo();
    }

    public com.tencent.ilink.auth.FaceVideo addAllElementFrames(java.util.Collection<com.tencent.ilink.auth.FaceFrame> collection) {
        this.frames.addAll(collection);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceVideo addElementFrames(com.tencent.ilink.auth.FaceFrame faceFrame) {
        this.frames.add(faceFrame);
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceVideo build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.ilink.auth.FaceVideo)) {
            return false;
        }
        com.tencent.ilink.auth.FaceVideo faceVideo = (com.tencent.ilink.auth.FaceVideo) fVar;
        return n51.f.a(this.frames, faceVideo.frames) && n51.f.a(this.action, faceVideo.action);
    }

    public com.tencent.ilink.auth.LiveActionType getAction() {
        return this.hasSetFields[2] ? this.action : com.tencent.ilink.auth.LiveActionType.ENUM_EYE_BLINK;
    }

    public java.util.LinkedList<com.tencent.ilink.auth.FaceFrame> getFrames() {
        return this.frames;
    }

    public boolean hasAction() {
        return hasFieldNumber(2);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFrames() {
        return hasFieldNumber(1);
    }

    public com.tencent.ilink.auth.FaceVideo mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.ilink.auth.FaceVideo();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.g(1, 8, this.frames);
            com.tencent.ilink.auth.LiveActionType liveActionType = this.action;
            if (liveActionType != null && this.hasSetFields[2]) {
                fVar.e(2, liveActionType.value);
            }
            return 0;
        }
        if (i17 == 1) {
            int g17 = b36.f.g(1, 8, this.frames) + 0;
            com.tencent.ilink.auth.LiveActionType liveActionType2 = this.action;
            return (liveActionType2 == null || !this.hasSetFields[2]) ? g17 : g17 + b36.f.e(2, liveActionType2.value);
        }
        if (i17 == 2) {
            this.frames.clear();
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue != 1) {
            if (intValue != 2) {
                return -1;
            }
            this.action = com.tencent.ilink.auth.LiveActionType.forNumber(aVar2.g(intValue));
            this.hasSetFields[2] = true;
            return 0;
        }
        java.util.LinkedList j17 = aVar2.j(intValue);
        int size = j17.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j17.get(i18);
            com.tencent.ilink.auth.FaceFrame faceFrame = new com.tencent.ilink.auth.FaceFrame();
            if (bArr != null && bArr.length > 0) {
                faceFrame.parseFrom(bArr);
            }
            this.frames.add(faceFrame);
        }
        this.hasSetFields[1] = true;
        return 0;
    }

    public com.tencent.ilink.auth.FaceVideo setAction(com.tencent.ilink.auth.LiveActionType liveActionType) {
        this.action = liveActionType;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceVideo setFrames(java.util.LinkedList<com.tencent.ilink.auth.FaceFrame> linkedList) {
        this.frames = linkedList;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.ilink.auth.FaceVideo mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.ilink.auth.FaceVideo parseFrom(byte[] bArr) {
        return (com.tencent.ilink.auth.FaceVideo) super.parseFrom(bArr);
    }
}
