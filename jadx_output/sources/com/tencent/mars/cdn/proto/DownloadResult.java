package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class DownloadResult extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.DownloadResult DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.DownloadResult();
    private com.tencent.mars.cdn.proto.AppendGet.Result append;
    private int apptype;
    private com.tencent.mars.cdn.proto.BaseResult base;
    private int bizid;
    private com.tencent.mars.cdn.proto.Cost cost;
    private int error_code;
    private java.lang.String error_msg;
    private int error_type;
    private java.lang.String filekey;
    private int filetype;
    private com.tencent.mars.cdn.proto.FriendsVideoProfile friends_video;
    private com.tencent.mars.cdn.proto.NetworkProfile network;
    private com.tencent.mars.cdn.proto.PreloadProfile preload;
    private com.tencent.mars.cdn.proto.StreamingProfile streaming;
    private com.tencent.mars.cdn.proto.TransforProfile transfor;
    private com.tencent.mars.cdn.proto.VideoProfile video;
    private java.util.LinkedList<com.tencent.mars.cdn.proto.FileStat> files = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[18];

    public static com.tencent.mars.cdn.proto.DownloadResult create() {
        return new com.tencent.mars.cdn.proto.DownloadResult();
    }

    public static com.tencent.mars.cdn.proto.DownloadResult getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.DownloadResult newBuilder() {
        return new com.tencent.mars.cdn.proto.DownloadResult();
    }

    public com.tencent.mars.cdn.proto.DownloadResult addAllElementFiles(java.util.Collection<com.tencent.mars.cdn.proto.FileStat> collection) {
        this.files.addAll(collection);
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult addElementFiles(com.tencent.mars.cdn.proto.FileStat fileStat) {
        this.files.add(fileStat);
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.DownloadResult)) {
            return false;
        }
        com.tencent.mars.cdn.proto.DownloadResult downloadResult = (com.tencent.mars.cdn.proto.DownloadResult) fVar;
        return n51.f.a(this.filekey, downloadResult.filekey) && n51.f.a(java.lang.Integer.valueOf(this.bizid), java.lang.Integer.valueOf(downloadResult.bizid)) && n51.f.a(java.lang.Integer.valueOf(this.apptype), java.lang.Integer.valueOf(downloadResult.apptype)) && n51.f.a(java.lang.Integer.valueOf(this.filetype), java.lang.Integer.valueOf(downloadResult.filetype)) && n51.f.a(java.lang.Integer.valueOf(this.error_type), java.lang.Integer.valueOf(downloadResult.error_type)) && n51.f.a(java.lang.Integer.valueOf(this.error_code), java.lang.Integer.valueOf(downloadResult.error_code)) && n51.f.a(this.error_msg, downloadResult.error_msg) && n51.f.a(this.base, downloadResult.base) && n51.f.a(this.files, downloadResult.files) && n51.f.a(this.preload, downloadResult.preload) && n51.f.a(this.video, downloadResult.video) && n51.f.a(this.streaming, downloadResult.streaming) && n51.f.a(this.cost, downloadResult.cost) && n51.f.a(this.network, downloadResult.network) && n51.f.a(this.transfor, downloadResult.transfor) && n51.f.a(this.friends_video, downloadResult.friends_video) && n51.f.a(this.append, downloadResult.append);
    }

    public com.tencent.mars.cdn.proto.AppendGet.Result getAppend() {
        return this.hasSetFields[17] ? this.append : com.tencent.mars.cdn.proto.AppendGet.Result.create();
    }

    public int getApptype() {
        return this.apptype;
    }

    public com.tencent.mars.cdn.proto.BaseResult getBase() {
        return this.hasSetFields[8] ? this.base : com.tencent.mars.cdn.proto.BaseResult.create();
    }

    public int getBizid() {
        return this.bizid;
    }

    public com.tencent.mars.cdn.proto.Cost getCost() {
        return this.hasSetFields[13] ? this.cost : com.tencent.mars.cdn.proto.Cost.create();
    }

    public int getErrorCode() {
        return this.error_code;
    }

    public java.lang.String getErrorMsg() {
        return this.hasSetFields[7] ? this.error_msg : "";
    }

    public int getErrorType() {
        return this.error_type;
    }

    public java.lang.String getFilekey() {
        return this.hasSetFields[1] ? this.filekey : "";
    }

    public java.util.LinkedList<com.tencent.mars.cdn.proto.FileStat> getFiles() {
        return this.files;
    }

    public int getFiletype() {
        return this.filetype;
    }

    public com.tencent.mars.cdn.proto.FriendsVideoProfile getFriendsVideo() {
        return this.hasSetFields[16] ? this.friends_video : com.tencent.mars.cdn.proto.FriendsVideoProfile.create();
    }

    public com.tencent.mars.cdn.proto.NetworkProfile getNetwork() {
        return this.hasSetFields[14] ? this.network : com.tencent.mars.cdn.proto.NetworkProfile.create();
    }

    public com.tencent.mars.cdn.proto.PreloadProfile getPreload() {
        return this.hasSetFields[10] ? this.preload : com.tencent.mars.cdn.proto.PreloadProfile.create();
    }

    public com.tencent.mars.cdn.proto.StreamingProfile getStreaming() {
        return this.hasSetFields[12] ? this.streaming : com.tencent.mars.cdn.proto.StreamingProfile.create();
    }

    public com.tencent.mars.cdn.proto.TransforProfile getTransfor() {
        return this.hasSetFields[15] ? this.transfor : com.tencent.mars.cdn.proto.TransforProfile.create();
    }

    public com.tencent.mars.cdn.proto.VideoProfile getVideo() {
        return this.hasSetFields[11] ? this.video : com.tencent.mars.cdn.proto.VideoProfile.create();
    }

    public boolean hasAppend() {
        return hasFieldNumber(17);
    }

    public boolean hasApptype() {
        return hasFieldNumber(3);
    }

    public boolean hasBase() {
        return hasFieldNumber(8);
    }

    public boolean hasBizid() {
        return hasFieldNumber(2);
    }

    public boolean hasCost() {
        return hasFieldNumber(13);
    }

    public boolean hasErrorCode() {
        return hasFieldNumber(6);
    }

    public boolean hasErrorMsg() {
        return hasFieldNumber(7);
    }

    public boolean hasErrorType() {
        return hasFieldNumber(5);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFilekey() {
        return hasFieldNumber(1);
    }

    public boolean hasFiles() {
        return hasFieldNumber(9);
    }

    public boolean hasFiletype() {
        return hasFieldNumber(4);
    }

    public boolean hasFriendsVideo() {
        return hasFieldNumber(16);
    }

    public boolean hasNetwork() {
        return hasFieldNumber(14);
    }

    public boolean hasPreload() {
        return hasFieldNumber(10);
    }

    public boolean hasStreaming() {
        return hasFieldNumber(12);
    }

    public boolean hasTransfor() {
        return hasFieldNumber(15);
    }

    public boolean hasVideo() {
        return hasFieldNumber(11);
    }

    public com.tencent.mars.cdn.proto.DownloadResult mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.DownloadResult();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.filekey;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            if (this.hasSetFields[2]) {
                fVar.e(2, this.bizid);
            }
            if (this.hasSetFields[3]) {
                fVar.e(3, this.apptype);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.filetype);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.error_type);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.error_code);
            }
            java.lang.String str2 = this.error_msg;
            if (str2 != null && this.hasSetFields[7]) {
                fVar.j(7, str2);
            }
            com.tencent.mars.cdn.proto.BaseResult baseResult = this.base;
            if (baseResult != null && this.hasSetFields[8]) {
                fVar.i(8, baseResult.computeSize());
                this.base.writeFields(fVar);
            }
            fVar.g(9, 8, this.files);
            com.tencent.mars.cdn.proto.PreloadProfile preloadProfile = this.preload;
            if (preloadProfile != null && this.hasSetFields[10]) {
                fVar.i(10, preloadProfile.computeSize());
                this.preload.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.VideoProfile videoProfile = this.video;
            if (videoProfile != null && this.hasSetFields[11]) {
                fVar.i(11, videoProfile.computeSize());
                this.video.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.StreamingProfile streamingProfile = this.streaming;
            if (streamingProfile != null && this.hasSetFields[12]) {
                fVar.i(12, streamingProfile.computeSize());
                this.streaming.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.Cost cost = this.cost;
            if (cost != null && this.hasSetFields[13]) {
                fVar.i(13, cost.computeSize());
                this.cost.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.NetworkProfile networkProfile = this.network;
            if (networkProfile != null && this.hasSetFields[14]) {
                fVar.i(14, networkProfile.computeSize());
                this.network.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.TransforProfile transforProfile = this.transfor;
            if (transforProfile != null && this.hasSetFields[15]) {
                fVar.i(15, transforProfile.computeSize());
                this.transfor.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.FriendsVideoProfile friendsVideoProfile = this.friends_video;
            if (friendsVideoProfile != null && this.hasSetFields[16]) {
                fVar.i(16, friendsVideoProfile.computeSize());
                this.friends_video.writeFields(fVar);
            }
            com.tencent.mars.cdn.proto.AppendGet.Result result = this.append;
            if (result != null && this.hasSetFields[17]) {
                fVar.i(17, result.computeSize());
                this.append.writeFields(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.filekey;
            if (str3 != null && this.hasSetFields[1]) {
                i18 = b36.f.j(1, str3) + 0;
            }
            if (this.hasSetFields[2]) {
                i18 += b36.f.e(2, this.bizid);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.e(3, this.apptype);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.e(4, this.filetype);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.e(5, this.error_type);
            }
            if (this.hasSetFields[6]) {
                i18 += b36.f.e(6, this.error_code);
            }
            java.lang.String str4 = this.error_msg;
            if (str4 != null && this.hasSetFields[7]) {
                i18 += b36.f.j(7, str4);
            }
            com.tencent.mars.cdn.proto.BaseResult baseResult2 = this.base;
            if (baseResult2 != null && this.hasSetFields[8]) {
                i18 += b36.f.i(8, baseResult2.computeSize());
            }
            int g17 = i18 + b36.f.g(9, 8, this.files);
            com.tencent.mars.cdn.proto.PreloadProfile preloadProfile2 = this.preload;
            if (preloadProfile2 != null && this.hasSetFields[10]) {
                g17 += b36.f.i(10, preloadProfile2.computeSize());
            }
            com.tencent.mars.cdn.proto.VideoProfile videoProfile2 = this.video;
            if (videoProfile2 != null && this.hasSetFields[11]) {
                g17 += b36.f.i(11, videoProfile2.computeSize());
            }
            com.tencent.mars.cdn.proto.StreamingProfile streamingProfile2 = this.streaming;
            if (streamingProfile2 != null && this.hasSetFields[12]) {
                g17 += b36.f.i(12, streamingProfile2.computeSize());
            }
            com.tencent.mars.cdn.proto.Cost cost2 = this.cost;
            if (cost2 != null && this.hasSetFields[13]) {
                g17 += b36.f.i(13, cost2.computeSize());
            }
            com.tencent.mars.cdn.proto.NetworkProfile networkProfile2 = this.network;
            if (networkProfile2 != null && this.hasSetFields[14]) {
                g17 += b36.f.i(14, networkProfile2.computeSize());
            }
            com.tencent.mars.cdn.proto.TransforProfile transforProfile2 = this.transfor;
            if (transforProfile2 != null && this.hasSetFields[15]) {
                g17 += b36.f.i(15, transforProfile2.computeSize());
            }
            com.tencent.mars.cdn.proto.FriendsVideoProfile friendsVideoProfile2 = this.friends_video;
            if (friendsVideoProfile2 != null && this.hasSetFields[16]) {
                g17 += b36.f.i(16, friendsVideoProfile2.computeSize());
            }
            com.tencent.mars.cdn.proto.AppendGet.Result result2 = this.append;
            return (result2 == null || !this.hasSetFields[17]) ? g17 : g17 + b36.f.i(17, result2.computeSize());
        }
        if (i17 == 2) {
            this.files.clear();
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
                this.filekey = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.bizid = aVar2.g(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.apptype = aVar2.g(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.filetype = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.error_type = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.error_code = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.error_msg = aVar2.k(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    com.tencent.mars.cdn.proto.BaseResult baseResult3 = new com.tencent.mars.cdn.proto.BaseResult();
                    if (bArr != null && bArr.length > 0) {
                        baseResult3.parseFrom(bArr);
                    }
                    this.base = baseResult3;
                }
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    com.tencent.mars.cdn.proto.FileStat fileStat = new com.tencent.mars.cdn.proto.FileStat();
                    if (bArr2 != null && bArr2.length > 0) {
                        fileStat.parseFrom(bArr2);
                    }
                    this.files.add(fileStat);
                }
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                java.util.LinkedList j19 = aVar2.j(intValue);
                int size3 = j19.size();
                for (int i28 = 0; i28 < size3; i28++) {
                    byte[] bArr3 = (byte[]) j19.get(i28);
                    com.tencent.mars.cdn.proto.PreloadProfile preloadProfile3 = new com.tencent.mars.cdn.proto.PreloadProfile();
                    if (bArr3 != null && bArr3.length > 0) {
                        preloadProfile3.parseFrom(bArr3);
                    }
                    this.preload = preloadProfile3;
                }
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                java.util.LinkedList j27 = aVar2.j(intValue);
                int size4 = j27.size();
                for (int i29 = 0; i29 < size4; i29++) {
                    byte[] bArr4 = (byte[]) j27.get(i29);
                    com.tencent.mars.cdn.proto.VideoProfile videoProfile3 = new com.tencent.mars.cdn.proto.VideoProfile();
                    if (bArr4 != null && bArr4.length > 0) {
                        videoProfile3.parseFrom(bArr4);
                    }
                    this.video = videoProfile3;
                }
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                java.util.LinkedList j28 = aVar2.j(intValue);
                int size5 = j28.size();
                for (int i37 = 0; i37 < size5; i37++) {
                    byte[] bArr5 = (byte[]) j28.get(i37);
                    com.tencent.mars.cdn.proto.StreamingProfile streamingProfile3 = new com.tencent.mars.cdn.proto.StreamingProfile();
                    if (bArr5 != null && bArr5.length > 0) {
                        streamingProfile3.parseFrom(bArr5);
                    }
                    this.streaming = streamingProfile3;
                }
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j29 = aVar2.j(intValue);
                int size6 = j29.size();
                for (int i38 = 0; i38 < size6; i38++) {
                    byte[] bArr6 = (byte[]) j29.get(i38);
                    com.tencent.mars.cdn.proto.Cost cost3 = new com.tencent.mars.cdn.proto.Cost();
                    if (bArr6 != null && bArr6.length > 0) {
                        cost3.parseFrom(bArr6);
                    }
                    this.cost = cost3;
                }
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                java.util.LinkedList j37 = aVar2.j(intValue);
                int size7 = j37.size();
                for (int i39 = 0; i39 < size7; i39++) {
                    byte[] bArr7 = (byte[]) j37.get(i39);
                    com.tencent.mars.cdn.proto.NetworkProfile networkProfile3 = new com.tencent.mars.cdn.proto.NetworkProfile();
                    if (bArr7 != null && bArr7.length > 0) {
                        networkProfile3.parseFrom(bArr7);
                    }
                    this.network = networkProfile3;
                }
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                java.util.LinkedList j38 = aVar2.j(intValue);
                int size8 = j38.size();
                for (int i47 = 0; i47 < size8; i47++) {
                    byte[] bArr8 = (byte[]) j38.get(i47);
                    com.tencent.mars.cdn.proto.TransforProfile transforProfile3 = new com.tencent.mars.cdn.proto.TransforProfile();
                    if (bArr8 != null && bArr8.length > 0) {
                        transforProfile3.parseFrom(bArr8);
                    }
                    this.transfor = transforProfile3;
                }
                this.hasSetFields[15] = true;
                return 0;
            case 16:
                java.util.LinkedList j39 = aVar2.j(intValue);
                int size9 = j39.size();
                for (int i48 = 0; i48 < size9; i48++) {
                    byte[] bArr9 = (byte[]) j39.get(i48);
                    com.tencent.mars.cdn.proto.FriendsVideoProfile friendsVideoProfile3 = new com.tencent.mars.cdn.proto.FriendsVideoProfile();
                    if (bArr9 != null && bArr9.length > 0) {
                        friendsVideoProfile3.parseFrom(bArr9);
                    }
                    this.friends_video = friendsVideoProfile3;
                }
                this.hasSetFields[16] = true;
                return 0;
            case 17:
                java.util.LinkedList j47 = aVar2.j(intValue);
                int size10 = j47.size();
                for (int i49 = 0; i49 < size10; i49++) {
                    byte[] bArr10 = (byte[]) j47.get(i49);
                    com.tencent.mars.cdn.proto.AppendGet.Result result3 = new com.tencent.mars.cdn.proto.AppendGet.Result();
                    if (bArr10 != null && bArr10.length > 0) {
                        result3.parseFrom(bArr10);
                    }
                    this.append = result3;
                }
                this.hasSetFields[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.DownloadResult setAppend(com.tencent.mars.cdn.proto.AppendGet.Result result) {
        this.append = result;
        this.hasSetFields[17] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setApptype(int i17) {
        this.apptype = i17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setBase(com.tencent.mars.cdn.proto.BaseResult baseResult) {
        this.base = baseResult;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setBizid(int i17) {
        this.bizid = i17;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setCost(com.tencent.mars.cdn.proto.Cost cost) {
        this.cost = cost;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setErrorCode(int i17) {
        this.error_code = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setErrorMsg(java.lang.String str) {
        this.error_msg = str;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setErrorType(int i17) {
        this.error_type = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setFilekey(java.lang.String str) {
        this.filekey = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setFiles(java.util.LinkedList<com.tencent.mars.cdn.proto.FileStat> linkedList) {
        this.files = linkedList;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setFiletype(int i17) {
        this.filetype = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setFriendsVideo(com.tencent.mars.cdn.proto.FriendsVideoProfile friendsVideoProfile) {
        this.friends_video = friendsVideoProfile;
        this.hasSetFields[16] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setNetwork(com.tencent.mars.cdn.proto.NetworkProfile networkProfile) {
        this.network = networkProfile;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setPreload(com.tencent.mars.cdn.proto.PreloadProfile preloadProfile) {
        this.preload = preloadProfile;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setStreaming(com.tencent.mars.cdn.proto.StreamingProfile streamingProfile) {
        this.streaming = streamingProfile;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setTransfor(com.tencent.mars.cdn.proto.TransforProfile transforProfile) {
        this.transfor = transforProfile;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult setVideo(com.tencent.mars.cdn.proto.VideoProfile videoProfile) {
        this.video = videoProfile;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.DownloadResult mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.DownloadResult parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.DownloadResult) super.parseFrom(bArr);
    }
}
