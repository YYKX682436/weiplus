package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class Chatting extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.Chatting DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.Chatting();
    private int chat_type;
    private final boolean[] hasSetFields = new boolean[3];
    private int participant_count;

    public static com.tencent.mars.cdn.proto.Chatting create() {
        return new com.tencent.mars.cdn.proto.Chatting();
    }

    public static com.tencent.mars.cdn.proto.Chatting getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.Chatting newBuilder() {
        return new com.tencent.mars.cdn.proto.Chatting();
    }

    public com.tencent.mars.cdn.proto.Chatting build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.Chatting)) {
            return false;
        }
        com.tencent.mars.cdn.proto.Chatting chatting = (com.tencent.mars.cdn.proto.Chatting) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.chat_type), java.lang.Integer.valueOf(chatting.chat_type)) && n51.f.a(java.lang.Integer.valueOf(this.participant_count), java.lang.Integer.valueOf(chatting.participant_count));
    }

    public int getChatType() {
        return this.chat_type;
    }

    public int getParticipantCount() {
        return this.participant_count;
    }

    public boolean hasChatType() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasParticipantCount() {
        return hasFieldNumber(2);
    }

    public com.tencent.mars.cdn.proto.Chatting mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.Chatting();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (this.hasSetFields[1]) {
                fVar.e(1, this.chat_type);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.participant_count);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = this.hasSetFields[1] ? 0 + b36.f.e(1, this.chat_type) : 0;
            return this.hasSetFields[2] ? e17 + b36.f.e(2, this.participant_count) : e17;
        }
        if (i17 == 2) {
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
        if (intValue == 1) {
            this.chat_type = aVar2.g(intValue);
            this.hasSetFields[1] = true;
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.participant_count = aVar2.g(intValue);
        this.hasSetFields[2] = true;
        return 0;
    }

    public com.tencent.mars.cdn.proto.Chatting setChatType(int i17) {
        this.chat_type = i17;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Chatting setParticipantCount(int i17) {
        this.participant_count = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Chatting mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.Chatting parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.Chatting) super.parseFrom(bArr);
    }
}
