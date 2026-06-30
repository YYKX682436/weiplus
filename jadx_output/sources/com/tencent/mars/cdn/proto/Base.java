package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class Base extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.Base DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.Base();
    private com.tencent.mm.protobuf.g bizdata;
    private com.tencent.mars.cdn.proto.Chatting chat;
    private com.tencent.mars.cdn.proto.CipherContext cipher;
    private java.lang.String ctag;
    private com.tencent.mars.cdn.proto.Debug debug;
    private java.lang.String flowtag;
    private com.tencent.mars.cdn.proto.Group group;
    private com.tencent.mars.cdn.proto.History history;
    private long start_time;
    private com.tencent.mars.cdn.proto.TaskControlOptions task_control;
    private java.util.LinkedList<com.tencent.mars.cdn.proto.KeyValue> customkv = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[12];

    public static com.tencent.mars.cdn.proto.Base create() {
        return new com.tencent.mars.cdn.proto.Base();
    }

    public static com.tencent.mars.cdn.proto.Base getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.Base newBuilder() {
        return new com.tencent.mars.cdn.proto.Base();
    }

    public com.tencent.mars.cdn.proto.Base addAllElementCustomkv(java.util.Collection<com.tencent.mars.cdn.proto.KeyValue> collection) {
        this.customkv.addAll(collection);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base addElementCustomkv(com.tencent.mars.cdn.proto.KeyValue keyValue) {
        this.customkv.add(keyValue);
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.Base)) {
            return false;
        }
        com.tencent.mars.cdn.proto.Base base = (com.tencent.mars.cdn.proto.Base) fVar;
        return n51.f.a(this.debug, base.debug) && n51.f.a(this.customkv, base.customkv) && n51.f.a(this.ctag, base.ctag) && n51.f.a(this.flowtag, base.flowtag) && n51.f.a(this.history, base.history) && n51.f.a(this.group, base.group) && n51.f.a(this.bizdata, base.bizdata) && n51.f.a(this.task_control, base.task_control) && n51.f.a(this.cipher, base.cipher) && n51.f.a(this.chat, base.chat) && n51.f.a(java.lang.Long.valueOf(this.start_time), java.lang.Long.valueOf(base.start_time));
    }

    public com.tencent.mm.protobuf.g getBizdata() {
        return this.hasSetFields[7] ? this.bizdata : com.tencent.mm.protobuf.g.f192155b;
    }

    public com.tencent.mars.cdn.proto.Chatting getChat() {
        return this.hasSetFields[10] ? this.chat : com.tencent.mars.cdn.proto.Chatting.create();
    }

    public com.tencent.mars.cdn.proto.CipherContext getCipher() {
        return this.hasSetFields[9] ? this.cipher : com.tencent.mars.cdn.proto.CipherContext.create();
    }

    public java.lang.String getCtag() {
        return this.hasSetFields[3] ? this.ctag : "";
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.KeyValue> getCustomkv() {
        return this.customkv;
    }

    public com.tencent.mars.cdn.proto.Debug getDebug() {
        return this.hasSetFields[1] ? this.debug : com.tencent.mars.cdn.proto.Debug.create();
    }

    public java.lang.String getFlowtag() {
        return this.hasSetFields[4] ? this.flowtag : "";
    }

    public com.tencent.mars.cdn.proto.Group getGroup() {
        return this.hasSetFields[6] ? this.group : com.tencent.mars.cdn.proto.Group.create();
    }

    public com.tencent.mars.cdn.proto.History getHistory() {
        return this.hasSetFields[5] ? this.history : com.tencent.mars.cdn.proto.History.create();
    }

    public long getStartTime() {
        return this.start_time;
    }

    public com.tencent.mars.cdn.proto.TaskControlOptions getTaskControl() {
        return this.hasSetFields[8] ? this.task_control : com.tencent.mars.cdn.proto.TaskControlOptions.create();
    }

    public boolean hasBizdata() {
        return hasFieldNumber(7);
    }

    public boolean hasChat() {
        return hasFieldNumber(10);
    }

    public boolean hasCipher() {
        return hasFieldNumber(9);
    }

    public boolean hasCtag() {
        return hasFieldNumber(3);
    }

    public boolean hasCustomkv() {
        return hasFieldNumber(2);
    }

    public boolean hasDebug() {
        return hasFieldNumber(1);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFlowtag() {
        return hasFieldNumber(4);
    }

    public boolean hasGroup() {
        return hasFieldNumber(6);
    }

    public boolean hasHistory() {
        return hasFieldNumber(5);
    }

    public boolean hasStartTime() {
        return hasFieldNumber(11);
    }

    public boolean hasTaskControl() {
        return hasFieldNumber(8);
    }

    public com.tencent.mars.cdn.proto.Base mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.Base();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.tencent.mars.cdn.proto.Debug debug = this.debug;
            if (debug != null && this.hasSetFields[1]) {
                fVar.i(1, debug.computeSize());
                this.debug.writeFields(fVar);
            }
            fVar.g(2, 8, this.customkv);
            java.lang.String str = this.ctag;
            if (str != null && this.hasSetFields[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.flowtag;
            if (str2 != null && this.hasSetFields[4]) {
                fVar.j(4, str2);
            }
            com.tencent.mars.cdn.proto.History history = this.history;
            if (history != null && this.hasSetFields[5]) {
                fVar.i(5, history.computeSize());
                this.history.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.Group group = this.group;
            if (group != null && this.hasSetFields[6]) {
                fVar.i(6, group.computeSize());
                this.group.writeFields(fVar);
            }
            com.tencent.mm.protobuf.g gVar = this.bizdata;
            if (gVar != null && this.hasSetFields[7]) {
                fVar.b(7, gVar);
            }
            com.tencent.mars.cdn.proto.TaskControlOptions taskControlOptions = this.task_control;
            if (taskControlOptions != null && this.hasSetFields[8]) {
                fVar.i(8, taskControlOptions.computeSize());
                this.task_control.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.CipherContext cipherContext = this.cipher;
            if (cipherContext != null && this.hasSetFields[9]) {
                fVar.i(9, cipherContext.computeSize());
                this.cipher.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.Chatting chatting = this.chat;
            if (chatting != null && this.hasSetFields[10]) {
                fVar.i(10, chatting.computeSize());
                this.chat.writeFields(fVar);
            }
            if (this.hasSetFields[11]) {
                fVar.h(11, this.start_time);
            }
            return 0;
        }
        if (i17 == 1) {
            com.tencent.mars.cdn.proto.Debug debug2 = this.debug;
            if (debug2 != null && this.hasSetFields[1]) {
                i18 = 0 + b36.f.i(1, debug2.computeSize());
            }
            int g17 = i18 + b36.f.g(2, 8, this.customkv);
            java.lang.String str3 = this.ctag;
            if (str3 != null && this.hasSetFields[3]) {
                g17 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.flowtag;
            if (str4 != null && this.hasSetFields[4]) {
                g17 += b36.f.j(4, str4);
            }
            com.tencent.mars.cdn.proto.History history2 = this.history;
            if (history2 != null && this.hasSetFields[5]) {
                g17 += b36.f.i(5, history2.computeSize());
            }
            com.tencent.mars.cdn.proto.Group group2 = this.group;
            if (group2 != null && this.hasSetFields[6]) {
                g17 += b36.f.i(6, group2.computeSize());
            }
            com.tencent.mm.protobuf.g gVar2 = this.bizdata;
            if (gVar2 != null && this.hasSetFields[7]) {
                g17 += b36.f.b(7, gVar2);
            }
            com.tencent.mars.cdn.proto.TaskControlOptions taskControlOptions2 = this.task_control;
            if (taskControlOptions2 != null && this.hasSetFields[8]) {
                g17 += b36.f.i(8, taskControlOptions2.computeSize());
            }
            com.tencent.mars.cdn.proto.CipherContext cipherContext2 = this.cipher;
            if (cipherContext2 != null && this.hasSetFields[9]) {
                g17 += b36.f.i(9, cipherContext2.computeSize());
            }
            com.tencent.mars.cdn.proto.Chatting chatting2 = this.chat;
            if (chatting2 != null && this.hasSetFields[10]) {
                g17 += b36.f.i(10, chatting2.computeSize());
            }
            return this.hasSetFields[11] ? g17 + b36.f.h(11, this.start_time) : g17;
        }
        if (i17 == 2) {
            this.customkv.clear();
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
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mars.cdn.proto.Debug debug3 = new com.tencent.mars.cdn.proto.Debug();
                    if (bArr != null && bArr.length > 0) {
                        debug3.parseFrom(bArr);
                    }
                    this.debug = debug3;
                }
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mars.cdn.proto.KeyValue keyValue = new com.tencent.mars.cdn.proto.KeyValue();
                    if (bArr2 != null && bArr2.length > 0) {
                        keyValue.parseFrom(bArr2);
                    }
                    this.customkv.add(keyValue);
                }
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.ctag = aVar2.k(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.flowtag = aVar2.k(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mars.cdn.proto.History history3 = new com.tencent.mars.cdn.proto.History();
                    if (bArr3 != null && bArr3.length > 0) {
                        history3.parseFrom(bArr3);
                    }
                    this.history = history3;
                }
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.mars.cdn.proto.Group group3 = new com.tencent.mars.cdn.proto.Group();
                    if (bArr4 != null && bArr4.length > 0) {
                        group3.parseFrom(bArr4);
                    }
                    this.group = group3;
                }
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.bizdata = aVar2.d(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.mars.cdn.proto.TaskControlOptions taskControlOptions3 = new com.tencent.mars.cdn.proto.TaskControlOptions();
                    if (bArr5 != null && bArr5.length > 0) {
                        taskControlOptions3.parseFrom(bArr5);
                    }
                    this.task_control = taskControlOptions3;
                }
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.mars.cdn.proto.CipherContext cipherContext3 = new com.tencent.mars.cdn.proto.CipherContext();
                    if (bArr6 != null && bArr6.length > 0) {
                        cipherContext3.parseFrom(bArr6);
                    }
                    this.cipher = cipherContext3;
                }
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.mars.cdn.proto.Chatting chatting3 = new com.tencent.mars.cdn.proto.Chatting();
                    if (bArr7 != null && bArr7.length > 0) {
                        chatting3.parseFrom(bArr7);
                    }
                    this.chat = chatting3;
                }
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.start_time = aVar2.i(intValue);
                this.hasSetFields[11] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.Base setBizdata(com.tencent.mm.protobuf.g gVar) {
        this.bizdata = gVar;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setChat(com.tencent.mars.cdn.proto.Chatting chatting) {
        this.chat = chatting;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setCipher(com.tencent.mars.cdn.proto.CipherContext cipherContext) {
        this.cipher = cipherContext;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setCtag(java.lang.String str) {
        this.ctag = str;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setCustomkv(java.util.LinkedList<com.tencent.mars.cdn.proto.KeyValue> linkedList) {
        this.customkv = linkedList;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setDebug(com.tencent.mars.cdn.proto.Debug debug) {
        this.debug = debug;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setFlowtag(java.lang.String str) {
        this.flowtag = str;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setGroup(com.tencent.mars.cdn.proto.Group group) {
        this.group = group;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setHistory(com.tencent.mars.cdn.proto.History history) {
        this.history = history;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setStartTime(long j17) {
        this.start_time = j17;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base setTaskControl(com.tencent.mars.cdn.proto.TaskControlOptions taskControlOptions) {
        this.task_control = taskControlOptions;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.Base mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.Base parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.Base) super.parseFrom(bArr);
    }
}
