package com.tencent.mars.cdn.proto;

/* loaded from: classes8.dex */
public class NetworkProfile extends com.tencent.mm.protobuf.f {
    private static final com.tencent.mars.cdn.proto.NetworkProfile DEFAULT_INSTANCE = new com.tencent.mars.cdn.proto.NetworkProfile();
    private int avg_conn_cost;
    private int avg_rtt;
    private int avg_speed;
    private int conn_times;
    private int first_conn_cost;
    private java.lang.String http_response_header;
    private int http_status_code;
    private boolean is_cross_network;
    private boolean is_private_protocol;
    private java.lang.String last_client_ip;
    private int last_network_type;
    private java.lang.String last_server_ip;
    private int last_server_port;
    private int server_fallback_count;
    private java.lang.String used_url;
    private java.lang.String xerrno;
    private java.util.LinkedList<java.lang.String> server_ips = new java.util.LinkedList<>();
    private final boolean[] hasSetFields = new boolean[18];

    public static com.tencent.mars.cdn.proto.NetworkProfile create() {
        return new com.tencent.mars.cdn.proto.NetworkProfile();
    }

    public static com.tencent.mars.cdn.proto.NetworkProfile getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static com.tencent.mars.cdn.proto.NetworkProfile newBuilder() {
        return new com.tencent.mars.cdn.proto.NetworkProfile();
    }

    public com.tencent.mars.cdn.proto.NetworkProfile addAllElementServerIps(java.util.Collection<java.lang.String> collection) {
        this.server_ips.addAll(collection);
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile addElementServerIps(java.lang.String str) {
        this.server_ips.add(str);
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile build() {
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof com.tencent.mars.cdn.proto.NetworkProfile)) {
            return false;
        }
        com.tencent.mars.cdn.proto.NetworkProfile networkProfile = (com.tencent.mars.cdn.proto.NetworkProfile) fVar;
        return n51.f.a(this.last_server_ip, networkProfile.last_server_ip) && n51.f.a(this.last_client_ip, networkProfile.last_client_ip) && n51.f.a(java.lang.Boolean.valueOf(this.is_cross_network), java.lang.Boolean.valueOf(networkProfile.is_cross_network)) && n51.f.a(java.lang.Integer.valueOf(this.avg_speed), java.lang.Integer.valueOf(networkProfile.avg_speed)) && n51.f.a(java.lang.Integer.valueOf(this.avg_conn_cost), java.lang.Integer.valueOf(networkProfile.avg_conn_cost)) && n51.f.a(java.lang.Integer.valueOf(this.first_conn_cost), java.lang.Integer.valueOf(networkProfile.first_conn_cost)) && n51.f.a(java.lang.Integer.valueOf(this.conn_times), java.lang.Integer.valueOf(networkProfile.conn_times)) && n51.f.a(java.lang.Integer.valueOf(this.avg_rtt), java.lang.Integer.valueOf(networkProfile.avg_rtt)) && n51.f.a(java.lang.Integer.valueOf(this.server_fallback_count), java.lang.Integer.valueOf(networkProfile.server_fallback_count)) && n51.f.a(java.lang.Integer.valueOf(this.http_status_code), java.lang.Integer.valueOf(networkProfile.http_status_code)) && n51.f.a(this.http_response_header, networkProfile.http_response_header) && n51.f.a(this.used_url, networkProfile.used_url) && n51.f.a(this.xerrno, networkProfile.xerrno) && n51.f.a(java.lang.Boolean.valueOf(this.is_private_protocol), java.lang.Boolean.valueOf(networkProfile.is_private_protocol)) && n51.f.a(this.server_ips, networkProfile.server_ips) && n51.f.a(java.lang.Integer.valueOf(this.last_server_port), java.lang.Integer.valueOf(networkProfile.last_server_port)) && n51.f.a(java.lang.Integer.valueOf(this.last_network_type), java.lang.Integer.valueOf(networkProfile.last_network_type));
    }

    public int getAvgConnCost() {
        return this.avg_conn_cost;
    }

    public int getAvgRtt() {
        return this.avg_rtt;
    }

    public int getAvgSpeed() {
        return this.avg_speed;
    }

    public int getConnTimes() {
        return this.conn_times;
    }

    public int getFirstConnCost() {
        return this.first_conn_cost;
    }

    public java.lang.String getHttpResponseHeader() {
        return this.hasSetFields[11] ? this.http_response_header : "";
    }

    public int getHttpStatusCode() {
        return this.http_status_code;
    }

    public boolean getIsCrossNetwork() {
        return this.is_cross_network;
    }

    public boolean getIsPrivateProtocol() {
        return this.is_private_protocol;
    }

    public java.lang.String getLastClientIp() {
        return this.hasSetFields[2] ? this.last_client_ip : "";
    }

    public int getLastNetworkType() {
        return this.last_network_type;
    }

    public java.lang.String getLastServerIp() {
        return this.hasSetFields[1] ? this.last_server_ip : "";
    }

    public int getLastServerPort() {
        return this.last_server_port;
    }

    public int getServerFallbackCount() {
        return this.server_fallback_count;
    }

    public java.util.LinkedList<java.lang.String> getServerIps() {
        return this.server_ips;
    }

    public java.lang.String getUsedUrl() {
        return this.hasSetFields[12] ? this.used_url : "";
    }

    public java.lang.String getXerrno() {
        return this.hasSetFields[13] ? this.xerrno : "";
    }

    public boolean hasAvgConnCost() {
        return hasFieldNumber(5);
    }

    public boolean hasAvgRtt() {
        return hasFieldNumber(8);
    }

    public boolean hasAvgSpeed() {
        return hasFieldNumber(4);
    }

    public boolean hasConnTimes() {
        return hasFieldNumber(7);
    }

    public boolean hasFieldNumber(int i17) {
        return this.hasSetFields[i17];
    }

    public boolean hasFirstConnCost() {
        return hasFieldNumber(6);
    }

    public boolean hasHttpResponseHeader() {
        return hasFieldNumber(11);
    }

    public boolean hasHttpStatusCode() {
        return hasFieldNumber(10);
    }

    public boolean hasIsCrossNetwork() {
        return hasFieldNumber(3);
    }

    public boolean hasIsPrivateProtocol() {
        return hasFieldNumber(14);
    }

    public boolean hasLastClientIp() {
        return hasFieldNumber(2);
    }

    public boolean hasLastNetworkType() {
        return hasFieldNumber(17);
    }

    public boolean hasLastServerIp() {
        return hasFieldNumber(1);
    }

    public boolean hasLastServerPort() {
        return hasFieldNumber(16);
    }

    public boolean hasServerFallbackCount() {
        return hasFieldNumber(9);
    }

    public boolean hasServerIps() {
        return hasFieldNumber(15);
    }

    public boolean hasUsedUrl() {
        return hasFieldNumber(12);
    }

    public boolean hasXerrno() {
        return hasFieldNumber(13);
    }

    public com.tencent.mars.cdn.proto.NetworkProfile mergeFrom(com.tencent.mm.protobuf.f fVar) {
        parseFrom(fVar.getData());
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new com.tencent.mars.cdn.proto.NetworkProfile();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.last_server_ip;
            if (str != null && this.hasSetFields[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.last_client_ip;
            if (str2 != null && this.hasSetFields[2]) {
                fVar.j(2, str2);
            }
            if (this.hasSetFields[3]) {
                fVar.a(3, this.is_cross_network);
            }
            if (this.hasSetFields[4]) {
                fVar.e(4, this.avg_speed);
            }
            if (this.hasSetFields[5]) {
                fVar.e(5, this.avg_conn_cost);
            }
            if (this.hasSetFields[6]) {
                fVar.e(6, this.first_conn_cost);
            }
            if (this.hasSetFields[7]) {
                fVar.e(7, this.conn_times);
            }
            if (this.hasSetFields[8]) {
                fVar.e(8, this.avg_rtt);
            }
            if (this.hasSetFields[9]) {
                fVar.e(9, this.server_fallback_count);
            }
            if (this.hasSetFields[10]) {
                fVar.e(10, this.http_status_code);
            }
            java.lang.String str3 = this.http_response_header;
            if (str3 != null && this.hasSetFields[11]) {
                fVar.j(11, str3);
            }
            java.lang.String str4 = this.used_url;
            if (str4 != null && this.hasSetFields[12]) {
                fVar.j(12, str4);
            }
            java.lang.String str5 = this.xerrno;
            if (str5 != null && this.hasSetFields[13]) {
                fVar.j(13, str5);
            }
            if (this.hasSetFields[14]) {
                fVar.a(14, this.is_private_protocol);
            }
            fVar.g(15, 1, this.server_ips);
            if (this.hasSetFields[16]) {
                fVar.e(16, this.last_server_port);
            }
            if (this.hasSetFields[17]) {
                fVar.e(17, this.last_network_type);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.last_server_ip;
            if (str6 != null && this.hasSetFields[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            java.lang.String str7 = this.last_client_ip;
            if (str7 != null && this.hasSetFields[2]) {
                i18 += b36.f.j(2, str7);
            }
            if (this.hasSetFields[3]) {
                i18 += b36.f.a(3, this.is_cross_network);
            }
            if (this.hasSetFields[4]) {
                i18 += b36.f.e(4, this.avg_speed);
            }
            if (this.hasSetFields[5]) {
                i18 += b36.f.e(5, this.avg_conn_cost);
            }
            if (this.hasSetFields[6]) {
                i18 += b36.f.e(6, this.first_conn_cost);
            }
            if (this.hasSetFields[7]) {
                i18 += b36.f.e(7, this.conn_times);
            }
            if (this.hasSetFields[8]) {
                i18 += b36.f.e(8, this.avg_rtt);
            }
            if (this.hasSetFields[9]) {
                i18 += b36.f.e(9, this.server_fallback_count);
            }
            if (this.hasSetFields[10]) {
                i18 += b36.f.e(10, this.http_status_code);
            }
            java.lang.String str8 = this.http_response_header;
            if (str8 != null && this.hasSetFields[11]) {
                i18 += b36.f.j(11, str8);
            }
            java.lang.String str9 = this.used_url;
            if (str9 != null && this.hasSetFields[12]) {
                i18 += b36.f.j(12, str9);
            }
            java.lang.String str10 = this.xerrno;
            if (str10 != null && this.hasSetFields[13]) {
                i18 += b36.f.j(13, str10);
            }
            if (this.hasSetFields[14]) {
                i18 += b36.f.a(14, this.is_private_protocol);
            }
            int g17 = i18 + b36.f.g(15, 1, this.server_ips);
            if (this.hasSetFields[16]) {
                g17 += b36.f.e(16, this.last_server_port);
            }
            return this.hasSetFields[17] ? g17 + b36.f.e(17, this.last_network_type) : g17;
        }
        if (i17 == 2) {
            this.server_ips.clear();
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
                this.last_server_ip = aVar2.k(intValue);
                this.hasSetFields[1] = true;
                return 0;
            case 2:
                this.last_client_ip = aVar2.k(intValue);
                this.hasSetFields[2] = true;
                return 0;
            case 3:
                this.is_cross_network = aVar2.c(intValue);
                this.hasSetFields[3] = true;
                return 0;
            case 4:
                this.avg_speed = aVar2.g(intValue);
                this.hasSetFields[4] = true;
                return 0;
            case 5:
                this.avg_conn_cost = aVar2.g(intValue);
                this.hasSetFields[5] = true;
                return 0;
            case 6:
                this.first_conn_cost = aVar2.g(intValue);
                this.hasSetFields[6] = true;
                return 0;
            case 7:
                this.conn_times = aVar2.g(intValue);
                this.hasSetFields[7] = true;
                return 0;
            case 8:
                this.avg_rtt = aVar2.g(intValue);
                this.hasSetFields[8] = true;
                return 0;
            case 9:
                this.server_fallback_count = aVar2.g(intValue);
                this.hasSetFields[9] = true;
                return 0;
            case 10:
                this.http_status_code = aVar2.g(intValue);
                this.hasSetFields[10] = true;
                return 0;
            case 11:
                this.http_response_header = aVar2.k(intValue);
                this.hasSetFields[11] = true;
                return 0;
            case 12:
                this.used_url = aVar2.k(intValue);
                this.hasSetFields[12] = true;
                return 0;
            case 13:
                this.xerrno = aVar2.k(intValue);
                this.hasSetFields[13] = true;
                return 0;
            case 14:
                this.is_private_protocol = aVar2.c(intValue);
                this.hasSetFields[14] = true;
                return 0;
            case 15:
                this.server_ips.add(aVar2.k(intValue));
                this.hasSetFields[15] = true;
                return 0;
            case 16:
                this.last_server_port = aVar2.g(intValue);
                this.hasSetFields[16] = true;
                return 0;
            case 17:
                this.last_network_type = aVar2.g(intValue);
                this.hasSetFields[17] = true;
                return 0;
            default:
                return -1;
        }
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setAvgConnCost(int i17) {
        this.avg_conn_cost = i17;
        this.hasSetFields[5] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setAvgRtt(int i17) {
        this.avg_rtt = i17;
        this.hasSetFields[8] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setAvgSpeed(int i17) {
        this.avg_speed = i17;
        this.hasSetFields[4] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setConnTimes(int i17) {
        this.conn_times = i17;
        this.hasSetFields[7] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setFirstConnCost(int i17) {
        this.first_conn_cost = i17;
        this.hasSetFields[6] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setHttpResponseHeader(java.lang.String str) {
        this.http_response_header = str;
        this.hasSetFields[11] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setHttpStatusCode(int i17) {
        this.http_status_code = i17;
        this.hasSetFields[10] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setIsCrossNetwork(boolean z17) {
        this.is_cross_network = z17;
        this.hasSetFields[3] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setIsPrivateProtocol(boolean z17) {
        this.is_private_protocol = z17;
        this.hasSetFields[14] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setLastClientIp(java.lang.String str) {
        this.last_client_ip = str;
        this.hasSetFields[2] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setLastNetworkType(int i17) {
        this.last_network_type = i17;
        this.hasSetFields[17] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setLastServerIp(java.lang.String str) {
        this.last_server_ip = str;
        this.hasSetFields[1] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setLastServerPort(int i17) {
        this.last_server_port = i17;
        this.hasSetFields[16] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setServerFallbackCount(int i17) {
        this.server_fallback_count = i17;
        this.hasSetFields[9] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setServerIps(java.util.LinkedList<java.lang.String> linkedList) {
        this.server_ips = linkedList;
        this.hasSetFields[15] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setUsedUrl(java.lang.String str) {
        this.used_url = str;
        this.hasSetFields[12] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile setXerrno(java.lang.String str) {
        this.xerrno = str;
        this.hasSetFields[13] = true;
        return this;
    }

    public com.tencent.mars.cdn.proto.NetworkProfile mergeFrom(byte[] bArr) {
        parseFrom(bArr);
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mars.cdn.proto.NetworkProfile parseFrom(byte[] bArr) {
        return (com.tencent.mars.cdn.proto.NetworkProfile) super.parseFrom(bArr);
    }
}
